package project.data.pojo;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Table(name = "t_account")
public class Account {

    @Id
    @GenericGenerator(strategy = "uuid", name = "account_uuid")
    @GeneratedValue(generator = "account_uuid")
    @Column(name = "account_id")
    private String id;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_currency")
    private String accountCurrency;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private BankUser bankUser;

    /*@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Cards> cards;*/

    public Account() {
    }

    public Account(String accountId, String accountNumber, String accountCurrency) {
        this.id = accountId;
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
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

    public BankUser getUser() {
        return bankUser;
    }

    public void setUser(BankUser bankUser) {
        this.bankUser = bankUser;
    }

    /*public List<Cards> getCards() {
        return cards;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }*/
}
