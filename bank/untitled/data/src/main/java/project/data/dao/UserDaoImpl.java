package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Cards;
import project.data.pojo.User;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

    private final SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("An argument sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);

    }

    @Override
    public User getUserById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(user);

    }

    @Override
    public boolean deleteUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        if (user == null) return false;
        session.remove(user);
        return true;

    }

    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM User", User.class).getResultList();
    }
}
