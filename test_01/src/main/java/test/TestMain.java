package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/test/test.xml");
		
		// BeanID : test.xml <bean id="testDaoImpl" class="test.TestDaoImpl"></bean>
		TestDao testDao = (TestDao)context.getBean("testDaoImpl");
		
		System.out.println("------------------Start");
		testDao.printMessage();
		System.out.println("------------------End");
	}

}
