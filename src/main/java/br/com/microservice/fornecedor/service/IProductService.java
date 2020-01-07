package br.com.microservice.fornecedor.service;

import java.util.List;

import br.com.microservice.fornecedor.entities.Product;

public interface IProductService {
	
	public List<Product> getProductsByState(String state);

}
