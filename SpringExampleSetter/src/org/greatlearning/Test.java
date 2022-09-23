package org.greatlearning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 

public class Test {
	
	public static void main(String[] args) {
		/*IOC Container---Bean Facotry
		 * Resource resource=new ClassPathResource("applicationContext.xml");
		 * BeanFactory f=new XmlBeanFactory(resource);
		 */
		
		///IOC ApplicationContext
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s=(Student)context.getBean("studentbean");
		Address a=(Address)context.getBean("address1");
		a.displayInfo();
		s.displayInfo();
		
	}

}
