package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SungJuk bean;
		bean = context.getBean("sungJukImpl",SungJuk.class);
		bean.calTot();
		bean.calAvg();
		bean.display();
		
		System.out.println();
		System.out.println("수정");
		bean.modify();
		bean.calTot();
		bean.calAvg();
		bean.display();
		
	}

}
