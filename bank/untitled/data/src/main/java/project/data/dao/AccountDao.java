package project.data.dao;

import project.data.pojo.Account;

public interface AccountDao {
    void createAccount(Account account);

    Account getBankCardById(String id);

    void updateAccount(Account account);

    boolean deleteAccount(Account account);
}
