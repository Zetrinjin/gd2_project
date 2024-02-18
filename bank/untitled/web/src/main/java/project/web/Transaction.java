package project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.data.model.TransactionDto;
import project.service.TransactionService;

@Controller
public class Transaction {

    @Autowired
    private TransactionService transactionService;

    @GetMapping(value = "/transaction")
    public String getRegistration() {
        return "transaction";
    }

    @PostMapping("/transaction")
    public String saveUser(@ModelAttribute("transactionDto") TransactionDto transactionDto){
        transactionService.getNewTransaction(transactionDto);
        return "redirect:/home";
    }

}
