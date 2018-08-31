package user.dao;

import java.util.List;

import user.bean.UserDTO;

public interface UserDAO {

	public UserDTO existId(String id);

	public void write(UserDTO userDTO);

	public List<UserDTO> getUserList();

}
