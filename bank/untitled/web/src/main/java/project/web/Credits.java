package project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.data.model.CreditDto;
import project.service.CreditService;

@Controller
public class Credits {

    @Autowired
    private CreditService creditService;
    @GetMapping(value = "/credits")
    public String getCreditPage() {
        return "credits";
    }


    @PostMapping(value = "/credits")
    public String createCredit(@ModelAttribute("creditDto") CreditDto creditDto){
        creditService.createNewCredit(creditDto);
        return "redirect:/home";
    }
}
