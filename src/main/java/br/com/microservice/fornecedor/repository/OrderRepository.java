package br.com.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.microservice.fornecedor.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
