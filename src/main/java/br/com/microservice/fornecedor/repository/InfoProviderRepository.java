package br.com.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.fornecedor.entities.InfoProvider;

@Repository
public interface InfoProviderRepository extends CrudRepository<InfoProvider, Long> {
	
	InfoProvider findByState(String state);

}
