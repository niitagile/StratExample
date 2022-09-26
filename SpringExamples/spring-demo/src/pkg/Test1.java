package pkg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Student obj = context.getBean(Student.class);
		obj.displayInfo();
		context.close();
	}

}
