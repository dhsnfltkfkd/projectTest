package user.dao;

import java.util.List;

import user.dto.UserDTO;

public interface UserDAO {
	
	public void userInsert(UserDTO userDTO);
	public List<UserDTO> getUserList();
	public void update(UserDTO userDTO);
	public UserDTO getUser(String id);
	public void userUpdate(UserDTO userDTO);
	public int userDelete(String id);
	

}
