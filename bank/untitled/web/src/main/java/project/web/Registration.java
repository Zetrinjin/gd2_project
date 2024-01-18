package project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.data.model.UserDto;
import project.service.UserService;

@Controller
public class Registration {

    @Autowired
    private UserService userService;

    @GetMapping(name = "/registration_1")
    public String getRegistration() {
        return "registration_1";
    }

    @PostMapping("/registration_1")
    public String saveUser(@ModelAttribute("registration_1")UserDto userDto){
        userService.registration(userDto);
        return "redirect:/home";

    }

}
