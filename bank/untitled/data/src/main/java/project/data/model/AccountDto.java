package project.data.model;

import project.data.pojo.BankUser;

public class AccountDto {

    private String id;

    private String accountNumber;

    private String accountCurrency;

    private BankUser bankUser;

    public AccountDto() {
    }

    public AccountDto(String accountId, String accountNumber, String accountCurrency) {
        this.id = accountId;
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
    }



    public String getAccountId() {
        return id;
    }

    public void setAccountId(String accountId) {
        this.id = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public BankUser getUser() {
        return bankUser;
    }

    public void setUser(BankUser bankUser) {
        this.bankUser = bankUser;
    }
}
