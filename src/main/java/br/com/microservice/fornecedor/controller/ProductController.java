package br.com.microservice.fornecedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.fornecedor.entities.Product;
import br.com.microservice.fornecedor.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private IProductService productService;
	
	@RequestMapping("/{state}")
	public List<Product> getProdutosPorEstado(@PathVariable("state") String state) {
		return productService.getProductsByState(state);
	}
}
