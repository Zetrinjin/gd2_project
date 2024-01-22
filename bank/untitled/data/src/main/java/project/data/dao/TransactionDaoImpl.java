package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Credit;
import project.data.pojo.Transaction;

@Repository
@Transactional
public class TransactionDaoImpl implements TransactionDao{

    private final SessionFactory sessionFactory;

    @Autowired
    public TransactionDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("An argument sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createTransaction(Transaction transaction) {

        Session session = sessionFactory.getCurrentSession();
        session.persist(transaction);

    }

    @Override
    public Transaction getTransactionById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Transaction.class, id);
    }

    @Override
    public void updateTransaction(Transaction transaction) {

        Session session = sessionFactory.getCurrentSession();
        session.merge(transaction);

    }

    @Override
    public boolean deleteTransaction(Transaction transaction) {
        Session session = sessionFactory.getCurrentSession();
        if (transaction == null) return false;
        session.remove(transaction);
        return true;
    }
}
