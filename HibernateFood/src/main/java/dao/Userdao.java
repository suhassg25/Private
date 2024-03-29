package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mysql.cj.protocol.Resultset;

import Controller.Config2;
import dto.User;
@Component("userdao")
@Scope(value = "prototype")
public class Userdao {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config2.class);
	
	public User saveUser(User user) {
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		EntityTransaction entityTransaction = applicationContext.getBean("et",EntityTransaction.class);
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		return user;
	}

	public User updateUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HM");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();

		return user;
	}

	public boolean deleteUser(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HM");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class, id);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}

	}

	public User findUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HM");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User user = entityManager.find(User.class, id);
		if (user != null) {
			return user;
		} else {
			return null;
		}

	}

	public User findUserByEmail(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HM");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select s from User s where s.email=?1");
		User user = (User) query.setParameter(1, email).getSingleResult();
		return user;
		
	}

}
