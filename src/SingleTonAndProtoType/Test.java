package SingleTonAndProtoType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ByUsingAnnotations.UsingAnnotations.Student;

public class Test {

public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SingleTonAndProtoType/beans.xml");	
		Student stu1 = context.getBean("stu",Student.class);
	    System.out.println(stu1.hashCode());
	    
	    Student stu2 = context.getBean("stu",Student.class);
	    System.out.println(stu2.hashCode());
	}
}
