package controllers;

import model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailController {
    @GetMapping("/home")
    public String home (Model model){
        String[] languages = {"English", "Vietnamese", "Japanese", "Chinese"};
        int[] size = {5,10,15,20,50,100};
        model.addAttribute("language" , languages);
        model.addAttribute("size", size);
        model.addAttribute("Mail", new Mail());
        return "home";
    }

    @PostMapping("/update")
    public String viewMail(@ModelAttribute("Mail") Mail mail, BindingResult result, Model model){
        model.addAttribute("language", mail.getLanguage());
        model.addAttribute("size", mail.getSize());
        model.addAttribute("spam", mail.getSpam());
        model.addAttribute("signature", mail.getSignature());
        return "view";
    }
}
