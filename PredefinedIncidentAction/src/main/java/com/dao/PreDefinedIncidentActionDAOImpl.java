ackage com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.PreDefinedIncidentAction;

@Component
public class PreDefinedIncidentActionDAOImpl  implements PreDefinedIncidentActionDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addPreDefinedIncident(PreDefinedIncidentAction action) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(action);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public PreDefinedIncidentAction findPreDefinedIncident(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		PreDefinedIncidentAction centre=session.get(PreDefinedIncidentAction.class, id);
		return action;
		
	}

	@Override
	public List<PreDefinedIncidentAction> findAllPreDefinedIncident() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<PreDefinedIncidentAction> personlist=session.createQuery("select i from PreDefinedIncidentAction i").list();
		return personlist;
	}

	@Override
	public boolean updatePreDefinedIncidentAction(PreDefinedIncidentAction action) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(session);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deletePreDefinedIncident(PreDefinedIncidentAction centre) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(session);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
		






















