package user.action;

import java.util.List;

import user.dao.UserDAO;
import user.dto.UserDTO;

public class UserSelectAction implements UserAction {

	public UserDAO userDAO;
	public UserDTO userDTO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void execute() {
		//db
		List<UserDTO> list =userDAO.getUserList();
		for(UserDTO userDTO: list) {//
			System.out.println(userDTO.getName()+"\t"+userDTO.getId()+"\t"+userDTO.getPwd());
			
		}
			
			
		
		
		
		

	}

}
