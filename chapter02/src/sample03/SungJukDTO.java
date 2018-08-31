package sample03;



public class SungJukDTO {
	
	private int kor,eng,math;
	private String name;
	private int tot;
	private double avg;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTot() {
		return tot;
	}
	
	public double getAvg() {
		return avg;
	}

	
	@Override
	public String toString() {
		return name+"\t"
				+ kor+"\t"
				+eng+"\t"
				+math+"\t"
				+tot+"\t"
				+String.format("%.2f", avg);
	
	}
	

}
