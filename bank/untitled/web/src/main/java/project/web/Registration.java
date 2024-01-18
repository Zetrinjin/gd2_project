package project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.data.model.BankUserDto;
import project.service.UserService;

@Controller
public class Registration {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/registration")
    public String getRegistration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String saveUser(@ModelAttribute("registration") BankUserDto bankUserDto){
        userService.registration(bankUserDto);
        return "redirect:/home";

    }

}
