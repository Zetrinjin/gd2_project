package project.data.pojo;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_credit")
public class Credit {

    @Id
    @GenericGenerator(strategy = "uuid", name = "person_uuid")
    @GeneratedValue(generator = "person_uuid")
    @Column(name = "credit_id")
    private String creditId;

    @Column(name = "sum_credit")
    private double sumCredit;

    @Column(name = "credit_period")
    private String creditPeriod;

    @Column(name = "credit_currency")
    private String creditCurrency;

    public Credit() {
    }

    public Credit(String creditId, double sumCredit, String creditPeriod, String creditCurrency) {
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

    public double getSumCredit() {
        return sumCredit;
    }

    public void setSumCredit(double sumCredit) {
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
