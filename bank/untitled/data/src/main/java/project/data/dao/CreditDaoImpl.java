package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Credit;

@Repository
@Transactional
public class CreditDaoImpl implements CreditDao {


    private final SessionFactory sessionFactory;

    public CreditDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createCredit(Credit credit) {
        Session session = sessionFactory.getCurrentSession();
        session.save(credit);

    }
}
