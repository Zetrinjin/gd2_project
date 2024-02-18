package project.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/*import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.data.pojo.News;

import java.util.List;

@Repository
@Transactional
public class NewsDaoImpl implements NewsDao{

    private final SessionFactory sessionFactory;

    @Autowired
    public NewsDaoImpl(SessionFactory sessionFactory) {
        if (sessionFactory == null) {
            throw new IllegalArgumentException("An argument sessionFactory cannot be null");
        }
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<News> getAllNews() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM News", News.class).getResultList();
    }

    @Override
    public List<News> getPagination(int startPosition, int pageSize) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM News", News.class)
                .setFirstResult(startPosition)
                .setMaxResults(pageSize)
                .getResultList();

    }

    /*@Override
    public Page<News> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.;
    }*/


    @Override
    public int getTotalCount() {
        Session session = sessionFactory.getCurrentSession();
        Long count = session.createQuery("SELECT count(*) FROM news", Long.class)
                .uniqueResult();
        return count.intValue();
    }
}
