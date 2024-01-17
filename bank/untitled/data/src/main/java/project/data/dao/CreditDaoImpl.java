package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Cards;
import project.data.pojo.Credit;

@Repository
@Transactional
public class CreditDaoImpl implements CreditDao {


    private final SessionFactory sessionFactory;

    public CreditDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("An argument sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createCredit(Credit credit) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(credit);

    }

    @Override
    public Credit getCreditById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Credit.class, id);
    }

    @Override
    public void updateCredit(Credit credit) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(credit);

    }

    @Override
    public boolean deleteCredit(Credit credit) {
        Session session = sessionFactory.getCurrentSession();
        if (credit == null) return false;
        session.remove(credit);
        return true;
    }
}
