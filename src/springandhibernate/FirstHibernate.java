package springandhibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstHibernate {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("jdbcConfig.xml");
		DAOLayer d = cp.getBean(DAOLayer.class);
		/*
		 * Items it = new Items(); 
		 * //Adding to DB
		 *  itm.setItemnno(6);
		 * itm.setItemname("Carrot"); itm.setPrice(120); 
		 * d.addData(It);
		 */
		
		/*
		 * Items i = new Items(); i.setItemnno(1); i.setItemname("Sirup");
		 * i.setPrice(5); d.updateData(i);
		 */
		
		int itemno = 2;
		Items i = d.getItemData(itemno);
		System.out.println(i);
		
	}

}
