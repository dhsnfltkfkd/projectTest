package user.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import user.action.UserAction;

public class HelloSpring {
	
	
	UserAction userAction=null;
	
	public void menu(ApplicationContext context) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.끝");
			System.out.print("번호입력:");
			int num = scan.nextInt();
			if(num==5) break;
			
			if(num==1) {
				
				
			}
		
			
		}
		
	}

	public static void main(String[] args) {
		ApplicationContext context =new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloSpring bean= (HelloSpring)context.getBean("helloSpring");
		bean.menu(context);
		
		

	}

}
