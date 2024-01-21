package project.data.model;

import jakarta.persistence.Column;

public class CreditDto {


    private String id;


    private String sumCredit;


    private String creditPercent;


    public CreditDto() {
    }

    public CreditDto(String creditId, String sumCredit, String creditPercent) {
        this.id = creditId;
        this.sumCredit = sumCredit;
        this.creditPercent = creditPercent;

    }

    public String getCreditId() {
        return id;
    }

    public void setCreditId(String creditId) {
        this.id = creditId;
    }

    public String getSumCredit() {
        return sumCredit;
    }

    public void setSumCredit(String sumCredit) {
        this.sumCredit = sumCredit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(String creditPercent) {
        this.creditPercent = creditPercent;
    }
}
