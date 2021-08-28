package com.example.demo.controller;

import com.example.demo.model.entity.Phone;
import com.example.demo.model.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping(value = "/phone")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page,
                        @RequestParam(value = "nameSearch" ,defaultValue = "") String nameSearch, Model model) {
        Sort sort = Sort.by("name").and(Sort.by("id")).ascending();
        if (nameSearch.equals("")) {
            model.addAttribute("phones", phoneService.findAll(PageRequest.of(page, 2, sort)));
        } else {
            model.addAttribute("nameSearch", nameSearch);
            model.addAttribute("phones", phoneService.findAllByName(nameSearch, PageRequest.of(page, 1, sort)));
        }
        return "list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Model model) {
        model.addAttribute("phones", new Phone());
        return "create";
    }

    @PostMapping(value = "/create")
    private String create(Phone phone) {
        this.phoneService.save(phone);
        return "create";
    }

    @GetMapping(value = "/edit")
    private String viewEdit(@RequestParam Integer id, Model model) {
        model.addAttribute("phones", phoneService.findById(id));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    private String edit(Phone phone) {
        this.phoneService.save(phone);
        return "redirect:/phone";
    }

    @GetMapping(value = "/delete")
    private String showFomrdelete(@RequestParam int id , Model model) {
        model.addAttribute("phones", phoneService.findById(id));
        return "delete";
    }

    @PostMapping(value = "/delete")
    private String delete(Phone phone) {
        this.phoneService.delete(phone);
        return "redirect:/phone";
    }

}
