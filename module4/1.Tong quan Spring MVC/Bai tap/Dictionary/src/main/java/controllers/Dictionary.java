package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("/dictionary")
    public String change() {
        return "index";
    }

    @PostMapping("/dictionary")
    public String dictionarychange(@RequestParam("word") String word, Model model){
        String vietnamese;
        switch (word){
            case "house":
                vietnamese = "nha";
                break;
            case "hello":
                vietnamese = "xin chao";
                break;
            case "dictionary":
                vietnamese = "tu dien";
                break;
            default:
                vietnamese = "Not found";
                break;
        }
        model.addAttribute("vietnamese", vietnamese);
        return "index";
    }
}
