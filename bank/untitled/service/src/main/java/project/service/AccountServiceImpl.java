package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.AccountDao;
import project.data.dao.BankUserDao;
import project.data.model.AccountDto;
import project.data.pojo.Account;

import java.util.Random;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private BankUserDao bankUserDao;
    @Override
    public void createBankAccount(AccountDto accountDto, String userId) {
        Account account = new Account();
        account.setAccountNumber(accountNumber());
        account.setAccountCurrency(accountDto.getAccountCurrency());
        account.setUser(bankUserDao.getUserById(userId));
        accountDao.createAccount(account);
    }

    private String accountNumber(){

        int accountNum = 16;
        Random random =new Random();
        int randomNumber;
        StringBuilder builder =new StringBuilder();

        for (int i=0;i<accountNum;i++){
            randomNumber = random.nextInt(9);
           builder.append(randomNumber);
        }
        return builder.toString();
    }
}
