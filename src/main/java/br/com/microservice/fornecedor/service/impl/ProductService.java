package br.com.microservice.fornecedor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.fornecedor.entities.Product;
import br.com.microservice.fornecedor.repository.ProductRepository;
import br.com.microservice.fornecedor.service.IProductService;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getProductsByState(String state) {
		return productRepository.findByState(state);
	}
	
}
