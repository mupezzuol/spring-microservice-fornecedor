package br.com.microservice.fornecedor.service;

import br.com.microservice.fornecedor.entities.InfoProvider;

public interface IInfoProviderService {

	InfoProvider getInfoByState(String state);

}
