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
    private String sumCredit;

    @Column(name = "credit_percent")
    private String creditPercent;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;


    public Credit() {
    }

    public Credit(String creditId, String sumCredit, String creditPercent) {
        this.creditId = creditId;
        this.sumCredit = sumCredit;
        this.creditPercent = creditPercent;
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

    public String getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(String creditPercent) {
        this.creditPercent = creditPercent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
