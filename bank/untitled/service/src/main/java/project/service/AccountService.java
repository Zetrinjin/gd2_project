package project.service;

import project.data.model.AccountDto;

public interface AccountService {
    void createBankAccount(AccountDto accountDto, String userId);
}
