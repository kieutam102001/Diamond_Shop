package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides>  GetDataSlides();
}
