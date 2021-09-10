package com.example.demo.controller;

import com.example.demo.model.entity.GiaoDich;
import com.example.demo.model.service.GiaoDichService;
import com.example.demo.model.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GiaoDichController {
    @Autowired
    private GiaoDichService giaoDichService;

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/giaodich")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page,
                        @RequestParam(value = "nameSearch", defaultValue = "") String nameSearch, Model model) {
//        Sort sort = Sort.by("maGiaoDich").and(Sort.by("maKhachHang")).ascending();
        if (nameSearch.equals("")) {
            model.addAttribute("giaodichs", giaoDichService.findAll(PageRequest.of(page, 2)));
        } else {
            model.addAttribute("nameSearch", nameSearch);
            model.addAttribute("giaodichs", giaoDichService.findAllByKhachHangContaining(nameSearch, PageRequest.of(page, 1)));
        }
        model.addAttribute("khachhangs", khachHangService.findAll());
        return "/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Model model) {
        model.addAttribute("khachhangs", khachHangService.findAll());
        model.addAttribute("giaodichs", new GiaoDich());
        return "/create";
    }

    @PostMapping(value = "/create")
    private String create(GiaoDich giaoDich) {
        this.giaoDichService.save(giaoDich);
        return "redirect:/giaodich";
    }

    @GetMapping(value = "/edit")
    private String viewEdit(@RequestParam String maGiaoDich, Model model) {
        model.addAttribute("khachhangs", khachHangService.findAll());
        model.addAttribute("giaodichs", giaoDichService.findById(maGiaoDich));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    private String edit(GiaoDich giaoDich) {
        this.giaoDichService.save(giaoDich);
        return "redirect:/giaodich";
    }

    @GetMapping(value = "/delete/{maGiaoDich}")
    private String delete(@PathVariable String maGiaoDich) {
        this.giaoDichService.remove(maGiaoDich);
        return "redirect:/giaodich";
    }
}
