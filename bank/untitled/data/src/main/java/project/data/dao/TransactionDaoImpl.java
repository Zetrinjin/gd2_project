package project.data.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Transaction;

@Repository
@Transactional
public class TransactionDaoImpl implements TransactionDao{
    @Override
    public void createTransaction(Transaction transaction) {

    }

    @Override
    public Transaction getTransactionById(String id) {
        return null;
    }
}
