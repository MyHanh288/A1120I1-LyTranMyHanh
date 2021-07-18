package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/caculator")
    public String viewCaculator() {
        return "index";
    }

    @PostMapping("/caculator")
    public String Caculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam String caculate, Model model) {
        int result = 0;
        switch (caculate) {
            case "addition":
                result = num1 + num2;
                break;
            case "subtraction":
                result = num1 - num2;
                break;
            case "multiplication":
                result = num1 * num2;
                break;
            case "division":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
