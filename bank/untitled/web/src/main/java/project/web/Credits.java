package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Credits {
    @GetMapping(value = "/credits")
    public String getCreditPage() {
        return "credits";
    }


    @PostMapping(value = "/credits")
    public String createCredit(@ModelAttribute Credits credits){
        return "redirect:/";
    }
}
