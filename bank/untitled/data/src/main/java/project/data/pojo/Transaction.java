package project.data.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_transaction")
public class Transaction {

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
