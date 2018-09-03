package cm.itcast.entity;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.itheima.utils.HibernateUtil;

public class LinkmanTest {
	@Test
public void	test01(){
		Session session = HibernateUtil.openSession();
		Transaction beginTransaction = session.beginTransaction();
		LinkMan linkMan = new LinkMan();
		linkMan.setLkmId(1L);
		linkMan.setLkmName("张标");
		linkMan.setLkmgender("女");
		session.save(linkMan);
		beginTransaction.commit();
		session.close();
		
		
				
	}

}
