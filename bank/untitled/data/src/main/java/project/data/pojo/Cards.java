package project.data.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "t_cards")
public class Cards {

    @Column(name = "card_id")
    private String id;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_number")
    private double cardNumber;

    @Column(name = "card_date")
    private String cardDate;

    @Column(name = "card_cvv")
    private int cvv;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Cards() {
    }

    public Cards(String id, String cardName, double cardNumber, String cardDate, int cvv, Account account) {
        this.id = id;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardDate = cardDate;
        this.cvv = cvv;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(double cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
