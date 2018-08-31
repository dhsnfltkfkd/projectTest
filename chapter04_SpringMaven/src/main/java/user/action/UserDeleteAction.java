package user.action;

import java.util.Scanner;

import user.dto.UserDTO;
import user.dao.UserDAO;

@co
public class UserDeleteAction implements UserAction {
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

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
		userDAO.userDelete(id);
		
		System.out.println("["+id+"] 님이 삭제되었습니다.");
		
	}

}










