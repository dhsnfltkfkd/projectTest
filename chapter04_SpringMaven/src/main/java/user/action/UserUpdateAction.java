package user.action;

import java.util.List;
import java.util.Scanner;

import user.dao.UserDAO;
import user.dto.UserDTO;

public class UserUpdateAction implements UserAction {

	private UserDTO userDTO;
	private UserDAO userDAO;

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 아이디");
		String id = scan.next();
		userDTO.setId(id);

		userDTO = userDAO.getUser(id);

		if (userDTO == null) {
			System.out.println("아이디가 존재하지 않습니다.");
			return;
		}
		
		System.out.println(userDTO.getName()+"\t"+userDTO.getId()+"\t"+userDTO.getPwd());
		System.out.println();
		
		System.out.print("수정할 이름 입력 :");
		userDTO.setName(scan.next());
		System.out.print("수정할 비밀번호:");
		userDTO.setPwd(scan.next());
		userDAO.userUpdate(userDTO);
		

	}

}
