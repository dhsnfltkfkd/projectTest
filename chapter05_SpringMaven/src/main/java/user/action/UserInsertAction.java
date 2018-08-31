package user.action;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Component
public class UserInsertAction implements UserAction{
	@Autowired
	private UserDTO userDTO;
	@Autowired
	private UserDAO userDAO;

	@Override
	public void execute() {
		//데이터
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
		
		//DB
		userDAO.userInsert(userDTO);
		
		System.out.println("데이터 저장하였습니다");		
	}

}












