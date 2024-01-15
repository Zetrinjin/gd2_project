package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.Cards;

@Repository
@Transactional
public class CardsDaoImpl implements CardsDao{

    private final SessionFactory sessionFactory;

    public CardsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createCard(Cards cards) {
        Session session = sessionFactory.getCurrentSession();
        session.save(cards);

    }

    @Override
    public Cards getCardById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Cards.class, id);

    }

    @Override
    public void updateCard(Cards cards) {

        Session session = sessionFactory.getCurrentSession();
        session.merge(cards);
    }

    @Override
    public boolean deleteCard(Cards cards) {
        Session session = sessionFactory.getCurrentSession();
        if (cards == null) return false;
        session.delete(cards);
        return true;

    }
}
