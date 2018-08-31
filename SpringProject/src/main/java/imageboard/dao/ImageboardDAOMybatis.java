package imageboard.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import imageboard.bean.ImageboardDTO;

@Transactional
@Component
public class ImageboardDAOMybatis implements ImageboardDAO {
	@Autowired
	private SqlSession sqlSession;

	public void imageboardWrite(ImageboardDTO imageboardDTO) {
		sqlSession.insert("imageboardSQL.imageboardWrite", imageboardDTO);
	}

	public List<ImageboardDTO> getImageboardList(Map<String, String> map) {
		return sqlSession.selectList("imageboardSQL.getImageboardList", map);
	}

	public int getTotalA() {
		
		return sqlSession.selectOne("imageboardSQL.getTotalA");
	}

	public void imageboardDelete(List<Integer> list) {
		sqlSession.delete("imageboardSQL.imageboardDelete",list);
	}
}









