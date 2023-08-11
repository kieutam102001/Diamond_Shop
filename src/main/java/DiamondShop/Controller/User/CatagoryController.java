package DiamondShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Dto.PaginatesDto;
import DiamondShop.Service.User.CategoryServiceImp;
import DiamondShop.Service.User.PaginatesServiceImpl;

@Controller
public class CatagoryController extends BaseController{
	
	@Autowired
	private CategoryServiceImp categoryService;
	
	@Autowired
	private PaginatesServiceImpl paginatesService;
	
	private int totalProductPage = 9;
	
	@RequestMapping(value = {"/san-pham/{id}"})
	public ModelAndView Product(@PathVariable String id) {
		_mvShare.setViewName("user/products/category");
		int totalData = categoryService.getAllProductsbyId(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = paginatesService.getInfoPaginates(totalData, totalProductPage, 1);
		_mvShare.addObject("idCategory",id);
		_mvShare.addObject("paginateInfo",paginatesInfo);
		_mvShare.addObject("ProductsPaginate",categoryService.getDataProductsPaginate(Integer.parseInt(id),paginatesInfo.getStart(),totalProductPage));
		return _mvShare;
	}
	
	@RequestMapping(value = {"/san-pham/{id}/{currentPage}"})
	public ModelAndView Product(@PathVariable String id, @PathVariable String currentPage ) {
		_mvShare.setViewName("user/products/category");
		int totalData = categoryService.getAllProductsbyId(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = paginatesService.getInfoPaginates(totalData, totalProductPage, Integer.parseInt(currentPage));
		_mvShare.addObject("idCategory",id);
		_mvShare.addObject("paginateInfo",paginatesInfo);
		_mvShare.addObject("ProductsPaginate",categoryService.getDataProductsPaginate(Integer.parseInt(id),paginatesInfo.getStart(),totalProductPage));
		return _mvShare;
	}
}
