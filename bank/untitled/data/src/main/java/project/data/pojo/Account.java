package project.data.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_account")
public class Account {

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_balance")
    private double accountBalance;

    public Account() {
    }

    public Account(String accountId, String accountNumber, double accountBalance) {
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
