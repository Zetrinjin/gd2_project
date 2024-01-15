package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Cards {
    @GetMapping(value = "/cards")
    public String getCardPage() {
        return "cards";
    }

    @PostMapping(value = "/cards")
    public String createCard(@ModelAttribute Cards cards){
        return "redirect:/";
    }
}
