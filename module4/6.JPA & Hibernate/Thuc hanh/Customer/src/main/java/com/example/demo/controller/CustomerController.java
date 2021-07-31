package com.example.demo.controller;

import com.example.demo.model.entity.Customer;
import com.example.demo.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customer")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("name").and(Sort.by("id")).descending();
        model.addAttribute("customers", customerService.findAll(PageRequest.of(page, 2, sort)));
        return "/list";
    }

    @GetMapping(value = "/search")
    private String search(@RequestParam(value = "page",defaultValue = "0") int page,
                          @RequestParam(value = "nameSearch",defaultValue = "") String nameSearch,Model model){
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();
        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("customers", customerService.findByNameContaining(nameSearch, PageRequest.of(page, 2, sort)));
        return "/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Customer customer, Model model) {
        model.addAttribute("customers", new Customer());
        return "/create";
    }

    @PostMapping(value = "/create")
    private String Create(Customer customer, Model model) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping(value = "/edit")
    private String viewEdit(Customer customer, Model model, @RequestParam Integer id) {
        model.addAttribute("customers", customerService.findById(id));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    private String Edit(Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping(value = "/delete")
    private String delete(Customer customer, @RequestParam Integer id) {
        customerService.remove(customer);
        return "redirect:/customer";
    }


}
