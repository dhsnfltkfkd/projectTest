package user.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import user.dto.UserDTO;

/*
public class UserDAOImpl implements UserDAO



class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbcTemplate;//connection, resultset 하는것이 이걸로 해결
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void userInsert(UserDTO userDTO) {

		String sql= "insert into usertable values(?,?,?)";
		jdbcTemplate.update(sql,userDTO.getName()
				,userDTO.getId()
				,userDTO.getPwd());
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql ="select * from usertable";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));//리절트 셋결과를 dto에 맵핑해줘야 하는데, 그역할을 해준다.
		//제너릭을 걸어줘야한다.
	}
	





}*/


public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO{
	
	private UserDAOImpl userDAOImpl;



//세터로 di잡는것도 name에서 해주므로 안해줘도됨.

	@Override
	public void userInsert(UserDTO userDTO) {
	/*	
		String sql= "insert into usertable values(?,?,?)";
		getJdbcTemplate().update(sql,userDTO.getName()
				,userDTO.getId()
				,userDTO.getPwd());*/
		//--------------------------------------------
		String sql = "insert into usertable values(:name, :id, :pwd)";
		Map<String,String> map = new HashMap<String,String>();
		map.put("id", userDTO.getId());
		map.put("name", userDTO.getName());
		map.put("pwd", userDTO.getPwd());
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}
		
	

	@Override
	public List<UserDTO> getUserList() {
		String sql ="select * from usertable";
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));//리절트 셋결과를 dto에 맵핑해줘야 하는데, 그역할을 해준다.
		//제너릭을 걸어줘야한다.
	}







	@Override
	public void update(UserDTO userDTO) {
		String sql= "insert into usertable values(?,?,?)";
		getJdbcTemplate().update(sql,userDTO.getName()
				,userDTO.getId()
				,userDTO.getPwd());
		
	}



	@Override
	public UserDTO getUser(String id) {
		String sql="select * from usertable where id=:id";
		try {
		return getJdbcTemplate().queryForObject(
				sql, 
				new BeanPropertyRowMapper<UserDTO>(UserDTO.class),
				id);
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
	}



	@Override
	public void userUpdate(UserDTO userDTO) {
		String sql = "update usertable set name=:name,pwd=:pwd where id=:id";
		Map<String,String> map = new HashMap<String,String>();
		map.put("id", userDTO.getId());
		map.put("name", userDTO.getName());
		map.put("pwd", userDTO.getPwd());
		getNamedParameterJdbcTemplate().update(sql, map);
	}



	@Override
	public int userDelete(String id) {
		String sql = "delete usertable where id=:id";
		return getJdbcTemplate().update(sql, id);
	}

	


	
	
	
}
