package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Account {

    @GetMapping(value = "/account")
    public String getAccountPage() {
        return "account";
    }


    @PostMapping(value = "/account")
    public String createAccount(@ModelAttribute Account account){
        return "redirect:/registraited";
    }
}
