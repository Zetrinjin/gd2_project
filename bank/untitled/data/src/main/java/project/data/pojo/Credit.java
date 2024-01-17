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
    private String creditPersent;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;


    public Credit() {
    }

    public Credit(String creditId, double sumCredit, String creditPersent) {
        this.creditId = creditId;
        this.sumCredit = sumCredit;
        this.creditPersent = creditPersent;
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

    public String getCreditPersent() {
        return creditPersent;
    }

    public void setCreditPersent(String creditPersent) {
        this.creditPersent = creditPersent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
