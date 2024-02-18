package project.data.model;

import project.data.pojo.Client;

public class AccountDto {

    private String id;

    private String accountNumber;

    private String accountCurrency;

    private Client client;

    public AccountDto() {
    }

    public AccountDto(String id, String accountNumber, String accountCurrency, Client client) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
        this.client = client;
    }

    /*public AccountDto(String accountId, String accountNumber, String accountCurrency) {
        this.id = accountId;
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
    }*/



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

    public Client getUser() {
        return client;
    }

    public void setUser(Client client) {
        this.client = client;
    }
}
