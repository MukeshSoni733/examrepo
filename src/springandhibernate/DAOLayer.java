package springandhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOLayer {
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
		System.out.println("jDBc sucessful");
	}

	public void addData(Items itm) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(itm);
		t.commit();
		s.close();
		System.out.println("Added");
	}

	public void updateData(Items i) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(i);
		t.commit();
		s.close();
		System.out.println("Update successfull");
	}

	public Items getItemData(int itemno) {
		// TODO Auto-generated method stub
		Session s =  sf.openSession();
		Items i = s.get(Items.class, itemno);
		return i;
	}
}
