package project.data.model;

import jakarta.persistence.Column;

public class AccountDto {


    private String accountId;


    private String accountNumber;


    private double accountBalance;

    public AccountDto() {
    }

    public AccountDto(String accountId, String accountNumber, double accountBalance) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
