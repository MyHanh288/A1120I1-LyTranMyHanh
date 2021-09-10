package com.example.demo.controller;

import com.example.demo.model.entity.KhuyenMai;
import com.example.demo.model.service.KhuyenMaiService;
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
public class KhuyenMaiController {
    @Autowired
    private KhuyenMaiService khuyenMaiService;
    @GetMapping(value = "/khuyenmai")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page,
                        @RequestParam(value = "nameSearch" ,defaultValue = "") String nameSearch, Model model) {
        Sort sort = Sort.by("tieuDe").and(Sort.by("khuyenMaiId")).ascending();
        if (nameSearch.equals("")) {
            model.addAttribute("khuyenmais", khuyenMaiService.findAll(PageRequest.of(page, 2, sort)));
        } else {
            model.addAttribute("nameSearch", nameSearch);
            model.addAttribute("khuyenmais", khuyenMaiService.findAllByTieuDeContaining(nameSearch, PageRequest.of(page, 1, sort)));
        }
        return "list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Model model) {
        model.addAttribute("khuyenmais", new KhuyenMai());
        return "create";
    }

    @PostMapping(value = "/create")
    private String create(KhuyenMai khuyenMai) {
        this.khuyenMaiService.save(khuyenMai);
        return "redirect:/khuyenmai";
    }

    @GetMapping(value = "/edit")
    private String viewEdit(@RequestParam Integer khuyenMaiId, Model model) {
        model.addAttribute("khuyenmais", khuyenMaiService.findById(khuyenMaiId));
        return "/edit";
    }

    @PostMapping(value = "/edit")
    private String edit(KhuyenMai khuyenMai) {
        this.khuyenMaiService.save(khuyenMai);
        return "redirect:/khuyenmai";
    }

    @GetMapping(value = "/khuyenmai/delete/{khuyenMaiId}")
    private String delete(@PathVariable Integer khuyenMaiId) {
        this.khuyenMaiService.remove(khuyenMaiId);
        return "redirect:/khuyenmai";
    }


}
