package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich {
    @GetMapping("/seasoning")
    public String seasoning(){
        return "index";
    }

    @PostMapping("/seasoning")
    public String viewSeasoning(@RequestParam ("seasoning") String [] seasoning, Model model){
        String result =" ";
        if(seasoning!= null)
        {
            for(String seas : seasoning)
            {
                result += seas + ",";
            }
        }
        else if(seasoning == null) {
            result = "Please choose your seasoning";
        }
        model.addAttribute("result", result);
        return "index";
    }
}
