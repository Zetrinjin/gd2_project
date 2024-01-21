package project.data.pojo;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_credit")
public class Credit {

    @Id
    @GenericGenerator(strategy = "uuid", name = "credit_uuid")
    @GeneratedValue(generator = "credit_uuid")
    @Column(name = "credit_id")
    private String id;

    @Column(name = "sum_credit")
    private String sumCredit;

    @Column(name = "credit_percent")
    private String creditPercent;

    /*@ManyToOne()
    @JoinColumn(name = "user_id")
    private BankUser bankUser;*/


    public Credit() {
    }

    public Credit(String creditId, String sumCredit, String creditPercent) {
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

    public String getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(String creditPercent) {
        this.creditPercent = creditPercent;
    }

   /* public BankUser getUser() {
        return bankUser;
    }

    public void setUser(BankUser bankUser) {
        this.bankUser = bankUser;
    }*/
}
