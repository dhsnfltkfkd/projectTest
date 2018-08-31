package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");//xml
		
		MessageBean bean = context.getBean("messageBeanImpl2", MessageBean.class); 
		//filePath꺼는 읽어오니까 messagebeanimpl2만 읽어오면 된다.
		
		bean.helloCall();
	}

}
