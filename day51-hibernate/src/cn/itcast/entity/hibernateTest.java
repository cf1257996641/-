package cn.itcast.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.itheima.utils.HibernateUtil;

public class hibernateTest {
	/**
	 * 加载配置文件
	 * 创建SessionFactory
	 * 创建一个新的Session
	 * 开始事务
	 * 增删改查
	 * 提交事务
	 * 释放资源
	 */
   @Test
  public void test01(){
	  //加载配置文件
	   Configuration cft = new Configuration();
	   cft.configure();
	   //创建SessionFactory
	   SessionFactory buildSessionFactory = cft.buildSessionFactory();
	   Session openSession = buildSessionFactory.openSession();
	   Transaction beginTransaction = openSession.beginTransaction();
	   Customer c = new Customer();
	   c.setCustId(1L);
	   c.setCustName("张飞");
	  c.setCustAddress("广州");
	   openSession.save(c);
	   openSession.close();

	   buildSessionFactory.close();
	   
	   
}
   @Test
   	public void	test02(){
	   Configuration configuration = new Configuration();
	   configuration.configure();
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Customer customer = new Customer();
		customer.setCustId(1L);
		customer.setCustName("晨光集团");
		customer.setCustAddress("广州");	
		openSession.save(customer);
		beginTransaction.commit();
		 openSession.close();
		buildSessionFactory.close();
	   
   }
   @Test
   public void test03() {
   Session session = HibernateUtil.openSession();
   Transaction beginTransaction = session.beginTransaction();
   Customer customer = session.get(Customer.class,27L);
   session.delete(customer);
   beginTransaction.commit();
   session.close();
   
   }

   @Test
   public void test04(){
	   Session session = HibernateUtil.openSession();
	   Transaction beginTransaction = session.beginTransaction();
	   Customer customer = session.get(Customer.class, 2L);
	   System.out.println(customer);
	   beginTransaction.commit();
	   session.close();
   }
   
  
}