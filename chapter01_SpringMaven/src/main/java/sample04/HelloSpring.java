package sample04;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.print("첫번째 숫자 : ");
		int a = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int b = scan.nextInt();
		
		Calc bean;
		bean = (Calc)context.getBean("calcAdd");
		bean.calculate(a, b);
		
		bean = (Calc)context.getBean("calcMul");
		bean.calculate(a, b);
		
		scan.close();
	}

}






