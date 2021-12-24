package mx.com.gruposalinas.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.gruposalinas.modelo.Cliente;
import mx.com.gruposalinas.modelo.dao.ClienteDao;
@Service
public class ClienteService{
	
	@Autowired
	private ClienteDao clienteDao;

	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Transactional(readOnly = true)
	public Cliente findById(Integer idCliente) {
		return clienteDao.findById(idCliente).orElse(null);
	}

	public void deleteById(Integer idCliente) {
		clienteDao.deleteById(idCliente);
		
	}

	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);	
	}

}
