package testSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.Student;


public class Spring__Context {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Student s1 = ctx.getBean("s1",Student.class);
		System.out.println(s1);
		Student s3 = ctx.getBean("s3", Student.class);
		System.out.println(s3);
	}

}
