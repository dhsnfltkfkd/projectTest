package sample03;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {

	private SungJukDTO sungJukDTO;
	
	
	public SungJukImpl(SungJukDTO sungJukDTO) {
		this.sungJukDTO = sungJukDTO;
	}

	@Override
	public void calTot() {
		
		sungJukDTO.setTot(sungJukDTO.getKor()+ sungJukDTO.getEng()+ sungJukDTO.getMath());
	}

	@Override
	public void calAvg() {
				sungJukDTO.setAvg((sungJukDTO.getTot()/3));
	}

	@Override
	public void display() {
		System.out.println("이름/국어/영어/수학/");
		System.out.println(sungJukDTO);	
	}
	
	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름입력:");
		sungJukDTO.setName(scan.next());
		System.out.println("국어입력:");
		sungJukDTO.setKor(scan.nextInt());
		System.out.println("영어입력:");
		sungJukDTO.setEng(scan.nextInt());
		System.out.println("수학입력:");
		sungJukDTO.setMath(scan.nextInt());
	}

}
