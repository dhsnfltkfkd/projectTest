package user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import user.bean.UserDTO;

@Transactional
@Component
public class UserDAOMybatis implements UserDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void userInsert(UserDTO userDTO) {
		int su = sqlSession.insert("userSQL.userInsert", userDTO);
	}

	@Override
	public List<UserDTO> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void userUpdate(UserDTO userDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public int userDelete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
