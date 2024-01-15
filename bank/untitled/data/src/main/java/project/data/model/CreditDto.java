package project.data.model;

import jakarta.persistence.Column;

public class CreditDto {


    private String creditId;


    private String sumCredit;


    private String creditPeriod;


    private String creditCurrency;

    public CreditDto() {
    }

    public CreditDto(String creditId, String sumCredit, String creditPeriod, String creditCurrency) {
        this.creditId = creditId;
        this.sumCredit = sumCredit;
        this.creditPeriod = creditPeriod;
        this.creditCurrency = creditCurrency;
    }

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
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

    public String getCreditCurrency() {
        return creditCurrency;
    }

    public void setCreditCurrency(String creditCurrency) {
        this.creditCurrency = creditCurrency;
    }
}
