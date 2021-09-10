package com.example.demo.controller;

import com.example.demo.model.entity.customer.Customer;
import com.example.demo.model.service.CustomerService;
import com.example.demo.model.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.websocket.server.PathParam;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("/customer")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page,
                        @RequestParam(value = "nameSearch", defaultValue = "") String nameSearch, Model model) {
        Sort sort = Sort.by("customerId").and(Sort.by("customerName")).ascending();
        if (nameSearch.equals("")) {
            model.addAttribute("customers", customerService.findAll(PageRequest.of(page, 2, sort)));
        } else {
            model.addAttribute("nameSearch", nameSearch);
            model.addAttribute("customers", customerService.findAllByCustomerNameContaining(nameSearch, PageRequest.of(page, 1, sort)));
        }
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "/customer/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Model model) {
        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("customers", new Customer());
        return "/customer/create";
    }

    @PostMapping(value = "/create")
    private String create(Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping(value = "/edit")
    private String viewEdit(@RequestParam String customerId, Model model) {
        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("customers", customerService.findById(customerId));
        return "/customer/edit";
    }

    @PostMapping(value = "/edit")
    private String edit(Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

//    customerId(value = "/delete")
//    private String showFomrdelete(@RequestParam String customerId, Model model) {
//        model.addAttribute("customerTypes", customerTypeService.findAll());
//        model.addAttribute("customers", customerService.findById(customerId));
//        return "/customer/delete";
//    }

    @GetMapping(value = "/customer/delete/{customerId}")
    private String delete(@PathVariable String customerId) {
        this.customerService.remove(customerId);
        return "redirect:/customer";
    }
}



