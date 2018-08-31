package user.action;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Component
public class UserDeleteAction implements UserAction {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 할 아이디 입력 : ");
		String id = scan.next();
		
		UserDTO userDTO = userDAO.getUser(id);
		
		if(userDTO==null) {
			System.out.println("아이디가 존재하지 않습니다");
			return;
		}
			
		int su = userDAO.userDelete(id);
		
		System.out.println(su+"개 데이터 삭제하였습니다");
	}

}










