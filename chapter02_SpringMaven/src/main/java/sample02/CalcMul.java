package sample02;


import lombok.Setter;

@Setter
public class CalcMul implements Calc {
	private int x,y;
	
	
	@Override
	public void Calculater() {
		System.out.println(x+"*"+y+"="+(x*y));
	}

}
