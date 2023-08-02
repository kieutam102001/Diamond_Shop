package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.SlidesDao;
import DiamondShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	
	@Override
	public List<Slides> GetDataSlides() {
		
		return slidesDao.GetDataSlides();
	}

}
