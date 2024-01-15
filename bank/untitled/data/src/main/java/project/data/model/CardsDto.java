package project.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class CardsDto {


    private String id;

    private String cardName;


    private double cardNumber;


    private String cardDate;


    private int cvv;

    public CardsDto() {
    }

    public CardsDto(String id, String cardName, double cardNumber, String cardDate, int cvv) {
        this.id = id;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardDate = cardDate;
        this.cvv = cvv;
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
}
