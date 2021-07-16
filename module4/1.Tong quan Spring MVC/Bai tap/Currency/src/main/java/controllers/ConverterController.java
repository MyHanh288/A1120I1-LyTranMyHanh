package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/convert")
    public String Converter(){
        return "index";
    }
    @PostMapping("/convert")
    public String CurrencyConverter(@RequestParam ("rate") Integer rate, @RequestParam ("usd") Integer usd, Model model){
        model.addAttribute("vnd", rate*usd);
        return "/index";
    }

}
