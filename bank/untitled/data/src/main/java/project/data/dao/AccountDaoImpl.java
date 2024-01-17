package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Account;
import project.data.pojo.Cards;

@Repository
@Transactional
public class AccountDaoImpl implements AccountDao{
    private final SessionFactory sessionFactory;

    public AccountDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("An argument sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createAccount(Account account) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(account);
    }

    @Override
    public Account getBankCardById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Account.class, id);

    }

    @Override
    public void updateAccount(Account account) {

        Session session = sessionFactory.getCurrentSession();
        session.merge(account);
    }

    @Override
    public boolean deleteAccount(Account account) {
        Session session = sessionFactory.getCurrentSession();
        if (account == null) return false;
        session.remove(account);
        return true;
    }
}
