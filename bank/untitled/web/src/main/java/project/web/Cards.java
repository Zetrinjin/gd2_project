package project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.data.model.CardsDto;
import project.service.CardService;

@Controller
public class Cards {

    @Autowired
    CardService cardService;
    @GetMapping(value = "/cards")
    public String getCardPage() {
        return "cards";
    }

    @PostMapping(value = "/cards")
    public String createCard(@ModelAttribute("cardsDto") CardsDto cardsDto){
        cardService.createNewCard(cardsDto);
        return "redirect:/home";
    }
}
