package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/home")
    public String getHomePage() {
        return "home";
    }



    @GetMapping(value = "/converter")
    public String getConv() {
        return "converter";
    }

    @GetMapping(value = "/registraited")
    public String getReg() {
        return "registraited";
    }

}
