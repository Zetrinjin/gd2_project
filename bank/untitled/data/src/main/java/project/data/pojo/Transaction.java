package project.data.pojo;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_transaction")
public class Transaction {

    @Id
    @GenericGenerator(strategy = "uuid", name = "tran_uuid")
    @GeneratedValue(generator = "tran_uuid")
    @Column(name = "transaction_id")
    private String id;

    @Column(name = "transaction_sum")
    private double transactionSum;


    @Column(name = "card_sender")
    private String cardSender;


    @Column(name = "card_recipient")
    private String cardRecipient;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private BankUser bankUser;*/

    public Transaction() {
    }

    public Transaction(String transactionId, double transactionSum, String cardSender, String cardRecipient) {
        this.id = transactionId;
        this.transactionSum = transactionSum;
        this.cardSender = cardSender;
        this.cardRecipient = cardRecipient;
    }

    public String getTransactionId() {
        return id;
    }

    public void setTransactionId(String transactionId) {
        this.id = transactionId;
    }

    public double getTransactionSum() {
        return transactionSum;
    }

    public void setTransactionSum(double transactionSum) {
        this.transactionSum = transactionSum;
    }

    public String getCardSender() {
        return cardSender;
    }

    public void setCardSender(String cardSender) {
        this.cardSender = cardSender;
    }

    public String getCardRecipient() {
        return cardRecipient;
    }

    public void setCardRecipient(String cardRecipient) {
        this.cardRecipient = cardRecipient;
    }

    /*public BankUser getUser() {
        return bankUser;
    }

    public void setUser(BankUser bankUser) {
        this.bankUser = bankUser;
    }*/
}
