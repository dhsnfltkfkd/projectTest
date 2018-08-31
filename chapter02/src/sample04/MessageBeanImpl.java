package sample04;

public class MessageBeanImpl implements MessageBean {
	private String name, phone;
	private Outputter outputter; //파일로 출력	

	public MessageBeanImpl() {
		System.out.println("MessageBeanImpl 기본 생성자");
	}
	public MessageBeanImpl(String name) {
		System.out.println("MessageBeanImpl Constructor"); 
		this.name = name;
	}
	
	public void setPhone(String phone) {
		System.out.println("setPhone");
		this.phone = phone;
	}

	public void setOutputter(Outputter outputter) {
		System.out.println("setOutputter");
		this.outputter = outputter;
	}

	@Override
	public void helloCall() {
		System.out.println("helloCall");
		outputter.output(name+" : "+phone); //outputter로 이름과 전화번호 보내기 
	}


}
