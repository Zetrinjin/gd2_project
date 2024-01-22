package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.BankUser;
import project.data.pojo.Cards;

import java.util.List;

@Repository
@Transactional
public class BankUserDaoImpl implements BankUserDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public BankUserDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("An argument sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createUser(BankUser bankUser) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(bankUser);

    }

    @Override
    public BankUser getUserById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(BankUser.class, id);
    }

    @Override
    public void updateUser(BankUser bankUser) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(bankUser);

    }

    @Override
    public boolean deleteUser(BankUser bankUser) {
        Session session = sessionFactory.getCurrentSession();
        if (bankUser == null) return false;
        session.remove(bankUser);
        return true;

    }

    @Override
    public List<BankUser> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM User", BankUser.class).getResultList();
    }

    @Override
    public List<BankUser> findByUserName(String username) {
        return sessionFactory.getCurrentSession()
                .createQuery("from User au where au.username=:username", BankUser.class)
                .setParameter("username", username)
                .list();
    }

    @Override
    public BankUser findByUserNameOne(String username) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM User where username = :username";
        Query<BankUser> query = session.createQuery(hql,BankUser.class);
        query.setParameter("username", username);
        return query.uniqueResult();
    }

}
