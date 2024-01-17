package project.data.pojo;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_transaction")
public class Transaction {

    @Id
    @GenericGenerator(strategy = "uuid", name = "person_uuid")
    @GeneratedValue(generator = "person_uuid")
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "transaction_sum")
    private double transactionSum;

    @Column(name = "transaction_time")
    private LocalDateTime transactionTime;

    public Transaction() {
    }


    public Transaction(String transactionId, double transactionSum, LocalDateTime transactionTime) {
        this.transactionId = transactionId;
        this.transactionSum = transactionSum;
        this.transactionTime = transactionTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getTransactionSum() {
        return transactionSum;
    }

    public void setTransactionSum(double transactionSum) {
        this.transactionSum = transactionSum;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }
}
