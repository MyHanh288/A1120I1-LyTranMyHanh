package com.example.customer.controller;

import com.example.customer.model.entity.Customer;
import com.example.customer.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class CustomerController{
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customer")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "nameSearch" ,defaultValue = "") String nameSearch, Model model) {
        Sort sort = Sort.by("name").and(Sort.by("id")).ascending();
        if (nameSearch.equals("")) {
            model.addAttribute("customers", customerService.findAll(PageRequest.of(page, 2, sort)));
        } else {
            model.addAttribute("nameSearch", nameSearch);
            model.addAttribute("customers", customerService.findAllByName(nameSearch, PageRequest.of(page, 1, sort)));
        }
        return "list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Model model) {
        model.addAttribute("customers", new Customer());
        return "create";
    }

    @PostMapping(value = "/create")
    private String create(@Valid @ModelAttribute ("customers") Customer customers, BindingResult bindingResult, Model model) {
        new Customer().validate(customers,bindingResult);
        if (bindingResult.hasErrors()) {
            return "create";
        }
        this.customerService.save(customers);
        return "redirect:/customer";
    }

    @GetMapping(value = "/edit")
    private String viewEdit(@RequestParam Integer id, Model model) {
        model.addAttribute("customers", customerService.findById(id));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    private String edit(Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping(value = "/delete")
    private String showFomrdelete(@RequestParam int id , Model model) {
        model.addAttribute("customers", customerService.findById(id));
        return "delete";
    }

    @PostMapping(value = "/delete")
    private String delete(Customer customer) {
        this.customerService.delete(customer);
        return "redirect:/customer";
    }


}
