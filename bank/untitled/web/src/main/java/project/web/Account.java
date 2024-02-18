package project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.data.dao.ClientDao;
import project.data.model.AccountDto;
import project.data.pojo.Client;
import project.service.AccountService;

@Controller
public class Account {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ClientDao clientDao;
    @GetMapping(value = "/account")
    public String getAccountPage() {
        return "account";
    }


    @PostMapping(value = "/account")
    public String createAccount(Authentication authentication, @ModelAttribute("accountDto") AccountDto accountDto){

        if(authentication !=null){
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String username = userDetails.getUsername();
            Client client =clientDao.findByUserNameOne(username);
            String clientId = client.getId();
            accountService.createBankAccount(accountDto,clientId);
        }
        return "redirect:/registraited";
    }
}
