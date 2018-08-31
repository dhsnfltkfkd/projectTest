package sample01;

public class MessageBeanImpl implements MessageBean {
	private String fruit;
	private int cost, qty;
	
	public MessageBeanImpl(String fruit) {
		this.fruit = fruit;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public void sayHello() {
		System.out.println(fruit+"\t"+cost+"\t"+qty);
	}

	@Override
	public void sayHello(String fruit, int cost) {
		System.out.println(fruit+"\t"+cost+"\t"+qty);
	}

	@Override
	public void sayHello(String fruit, int cost, int qty) {
		System.out.println(fruit+"\t"+cost+"\t"+qty);
	}

}




