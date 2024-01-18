package project.data.model;

import jakarta.persistence.Column;

public class CreditDto {


    private String id;


    private String sumCredit;


    private String creditPeriod;


    public CreditDto() {
    }

    public CreditDto(String creditId, String sumCredit, String creditPeriod) {
        this.id = creditId;
        this.sumCredit = sumCredit;
        this.creditPeriod = creditPeriod;

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

    public String getCreditPeriod() {
        return creditPeriod;
    }

    public void setCreditPeriod(String creditPeriod) {
        this.creditPeriod = creditPeriod;
    }

}
