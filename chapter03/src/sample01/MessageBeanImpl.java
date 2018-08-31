package sample01;

public class MessageBeanImpl implements MessageBean {
	private String str;

	public MessageBeanImpl(String str) {
		this.str = str;
	}
	

	@Override
	public void showPrintBefore() {
		System.out.println("showPrintBefore 메시지 = "+str);//핵심관심사항

	}

	@Override
	public void viewPrintBefore() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintBefore 메시지 = "+str);

	}

	@Override
	public void showPrintAfter() {
		System.out.println("showPrintAfter 메시지 = "+str);//핵심관심사항
		
	}

	@Override
	public void viewPrintAfter() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintAfter 메시지 = "+str);
		
	}
	
	@Override
	public String showPrint() {
		
		System.out.println("showPrint 메시지 = "+str);//핵심관심사항
		return "개바부";
		
	}

	@Override
	public void viewPrint() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrint 메시지 = "+str);
		
	}

	@Override
	public void display() {
		System.out.println("display 메시지 = "+str);

	}

}










