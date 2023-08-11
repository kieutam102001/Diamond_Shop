package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.ProductDao;
import DiamondShop.Dto.ProductDto;

@Service	
public class CategoryServiceImp implements ICategoryService{
	
	@Autowired
	ProductDao productDao = new ProductDao();
	
	@Override
	public List<ProductDto> getAllProductsbyId(int id) {
		// TODO Auto-generated method stub
		return productDao.GetDataProductbyID(id);
	}
	
	@Override
	public List<ProductDto> getDataProductsPaginate(int id,int start, int totalPage) {
		return productDao.GetDataProductPaginate(id,start, totalPage);
	}

	 

}
