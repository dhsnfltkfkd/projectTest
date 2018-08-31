package user.action;

import java.util.Scanner;

import user.dao.UserDAO;
import user.dto.UserDTO;

public class UserInsertAction implements UserAction {
	private UserDTO userDTO;
	private UserDAO userDAO;

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	// db
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	

	@Override
	public void execute() {
		// 데이터
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();

		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		userDAO.userInsert(userDTO);
		
		System.out.println("데이터를 저장하였습니다.");
	}

	


}
