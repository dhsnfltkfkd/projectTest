package user.action;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Component
public class UserUpdateAction implements UserAction {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정 할 아이디 입력 : ");
		String id = scan.next();
		
		UserDTO userDTO = userDAO.getUser(id);
		
		if(userDTO==null) {
			System.out.println("아이디가 존재하지 않습니다");
			return;
		}
		
		System.out.println(userDTO.getName()+"\t"+userDTO.getId()+"\t"+userDTO.getPwd());
		System.out.println();
		
		System.out.print("수정 할 이름 입력 : ");
		userDTO.setName(scan.next());
		System.out.print("수정 할 비밀번호 입력 : ");
		userDTO.setPwd(scan.next());
		
		userDAO.userUpdate(userDTO);
		
		System.out.println("데이터 수정하였습니다");

	}

}






