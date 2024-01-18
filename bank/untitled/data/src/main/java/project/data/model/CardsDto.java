package project.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class CardsDto {


    private String id;

    private String cardName;


    private double cardNumber;


    private double cardBalance;


    private int cvv;

    public CardsDto() {
    }

    public CardsDto(String id, String cardName, double cardNumber, double cardBalance, int cvv) {
        this.id = id;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
        this.cvv = cvv;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
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

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
