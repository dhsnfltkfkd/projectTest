package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean bean = (MessageBean) context.getBean("messageBeanImpl");
		bean.sayHello();
		bean.sayHello("딸기", 10000);
		bean.sayHello("사과", 2500, 10);

	}

}
