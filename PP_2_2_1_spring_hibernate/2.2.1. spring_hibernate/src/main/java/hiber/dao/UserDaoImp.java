package hiber.dao;

import hiber.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }
   @Override
   public User findByModel(String model) {
      return sessionFactory.getCurrentSession()
              .createQuery("select u from User u where u.car.model = :model", User.class)
              .setParameter("model", model)
              .getSingleResult();
   }

   @Override
   public User findBySeries(int series) {
      return sessionFactory.getCurrentSession()
              .createQuery("select u from User u where u.car.series = :series", User.class)
              .setParameter("series", series)
              .getSingleResult();
   }

}
