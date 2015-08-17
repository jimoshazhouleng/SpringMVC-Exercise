package controler;

import javax.servlet.ServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.ProductImpl;

@Controller
public class ProductController {

	Log log = LogFactory.getLog(getClass());
	
	@RequestMapping("/product_save")
	public String saveProduct(ServletRequest request,Model mode){
		ProductImpl product = new ProductImpl();
		product.setName(request.getParameter("name"));
		product.setPrice(Float.parseFloat(request.getParameter("price")));
		
		mode.addAttribute("product", product);
		return "ProductDetails";
	}
	@RequestMapping("/product_input")
	public String inputProduct(){
		log.info("/product_input");
		
		return "ProductForm";
	}
	
	
	
}
