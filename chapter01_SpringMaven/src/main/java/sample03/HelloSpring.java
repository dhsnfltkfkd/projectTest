package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		MessageBean bean = (MessageBean)context.getBean("messageBean");
		bean.sayHello("Spring");
		System.out.println();
		
		MessageBean bean2 = context.getBean("messageBean", MessageBean.class);
		bean2.sayHello("Spring");
		System.out.println();
		
		//MessageBean bean3 = (MessageBean)context.getBean("mb");
		//bean3.sayHello("Spring");
		//System.out.println();

	}
}










