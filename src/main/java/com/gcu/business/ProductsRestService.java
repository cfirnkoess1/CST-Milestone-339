package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.ProductList;
import com.gcu.model.ProductModel;


@RestController
@RequestMapping("/service")
public class ProductsRestService {
	@Autowired
	ProductsBusinessServiceInterface service;

	// maps to getjson and prints out the products in a json file to the webpage
	@GetMapping(path = "/getjson", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ProductModel> getProductssAsJson() {
		return service.getProducts();
	}
	
	 @GetMapping(path = "/getproduct/{productId}", produces = { MediaType.APPLICATION_JSON_VALUE })
     public List<ProductModel> getOneProductAsJSON(@PathVariable("productId") int productId) {
		 
		 List<ProductModel> one = new ArrayList<ProductModel>();
		 
		 one.add(service.getProducts().get(productId - 1));
         return one;
     }
	
}