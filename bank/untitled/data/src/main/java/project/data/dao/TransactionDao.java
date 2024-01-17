package project.data.dao;

import project.data.pojo.Transaction;
import project.data.pojo.User;

public interface TransactionDao {
    void createTransaction(Transaction transaction);
    Transaction getTransactionById(String id);

    void updateTransaction(Transaction transaction);

    boolean deleteTransaction(Transaction transaction);
}
