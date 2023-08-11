package DiamondShop.Service.User;

import java.util.List;

import DiamondShop.Dto.ProductDto;

public interface ICategoryService {
	public	List<ProductDto> getAllProductsbyId(int id);
	public	List<ProductDto> getDataProductsPaginate(int id,int start, int end);
}
