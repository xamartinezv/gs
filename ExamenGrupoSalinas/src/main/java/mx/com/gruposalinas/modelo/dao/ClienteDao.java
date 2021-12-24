package mx.com.gruposalinas.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.gruposalinas.modelo.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer>{
	

}
