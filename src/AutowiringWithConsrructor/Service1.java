package AutowiringWithConsrructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service1 {
	public static void main(String[] args)  {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("AutowiringWithConsrructor/beans1.xml");
		Student stu = context.getBean("stu",Student.class);
		System.out.println(stu);
	}
}
