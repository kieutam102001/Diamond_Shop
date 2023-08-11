package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.CategorysDao;
import DiamondShop.Dao.MenuDao;
import DiamondShop.Dao.ProductDao;
import DiamondShop.Dao.SlidesDao;
import DiamondShop.Dto.ProductDto;
import DiamondShop.Entity.Categorys;
import DiamondShop.Entity.Menu;
import DiamondShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductDao productDao;
	
	
	@Override
	public List<Slides> GetDataSlides() {
		
		return slidesDao.GetDataSlides();
	}
	
	public List<Categorys> GetDataCategorys() {
		
		
		return categorysDao.GetDataCategorys();
	}

	public List<Menu> GetDataMenu() {
		
		return menuDao.GetDataMenu();
	}

	@Override
	public List<ProductDto> GetDataNewProduct() {
		return productDao.GetDataNewProduct();
	}

	@Override
	public List<ProductDto> GetDataHightlightProduct() {
		// TODO Auto-generated method stub
		return productDao.GetDataHightlightProduct();
	}
	
	
	
	

}
