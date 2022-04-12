package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Admin;

@Component
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}
@Override
	public Admin findAdmin(int id) {
		Session session=sessionFactory.openSession();
	    Admin admin=session.find(Admin.class, id);
		// TODO Auto-generated method stub
		return admin;
	}

	@Override
	public List<Admin> findAllAdmin() {
		Session session=sessionFactory.openSession();
		List<Admin> adminlist=session.createQuery("select i from admin i").list();
				
		// TODO Auto-generated method stub
		return adminlist;
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		return true;
}

	@Override
	public boolean deleteAdmin(Admin admin) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		return false;
	}

}






















