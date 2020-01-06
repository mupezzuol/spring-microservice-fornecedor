package br.com.microservice.fornecedor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.fornecedor.entities.InfoProvider;
import br.com.microservice.fornecedor.repository.InfoProviderRepository;
import br.com.microservice.fornecedor.service.IInfoProviderService;

@Service
public class InfoProviderService implements IInfoProviderService{

	@Autowired
	private InfoProviderRepository providerRepository;
	
	@Override
	public InfoProvider getInfoByState(String state) {
		return this.providerRepository.findByState(state);
	}

}
