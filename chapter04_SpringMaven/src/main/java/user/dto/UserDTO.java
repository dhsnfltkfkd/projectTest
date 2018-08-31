package user.dto;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;

@Component
@Getter
public class UserDTO {
	

	private String name;
	private String id;
	private String pwd;
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	@Autowired
	public void setId(String id) {
		this.id = id;
	}
	@Autowired
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
