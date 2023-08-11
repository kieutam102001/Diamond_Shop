package DiamondShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{

	@RequestMapping(value = {"/","/trang-chu"})
	public ModelAndView index() {
		
		_mvShare.addObject("slides",_homeService.GetDataSlides());
		_mvShare.addObject("categorys",_homeService.GetDataCategorys());
		_mvShare.addObject("new_product",_homeService.GetDataNewProduct());
		_mvShare.addObject("highlight_product",_homeService.GetDataHightlightProduct());
		_mvShare.setViewName("user/products/product");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/product"})
	public ModelAndView Product() {
		ModelAndView  mv = new ModelAndView("user/product");
		return mv;
	}
	
	
	
	
}
