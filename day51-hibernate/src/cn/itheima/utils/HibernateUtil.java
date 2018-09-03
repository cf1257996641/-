package cn.itheima.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	//全局变量
   private static SessionFactory factory;
   
   //静态代码块 保证 一个SessionFactory
   static {
	   Configuration configuration = new Configuration();
	   configuration.configure();
	   factory=configuration.buildSessionFactory();
   }
   /**
    * 每次打开 都打开一个新的Session 对象
    * @return
    */
  public static Session openSession() {
	   return factory.openSession();
   }
  
}
