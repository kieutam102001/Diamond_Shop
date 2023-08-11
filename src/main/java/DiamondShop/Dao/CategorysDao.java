package DiamondShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamondShop.Entity.Categorys;
import DiamondShop.Entity.MapperCategorys;

@Repository
public class CategorysDao extends BaseDao{
	
	public List<Categorys>  GetDataCategorys(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categories";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;	
	}
}
