package mx.com.gruposalinas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.gruposalinas.modelo.Cliente;
import mx.com.gruposalinas.modelo.service.ClienteService;

@RestController
public class ClienteControlador{

	@Autowired
	ClienteService clienteService;
	
	
	@GetMapping("/cliente/{idCliente}")
	public Cliente obtenerClienteId(@PathVariable Integer idCliente) {
		return clienteService.findById(idCliente);
	}

	@GetMapping("/listarClientes")
	public List<Cliente> traerClientes() {
		return clienteService.findAll();
	}

	@DeleteMapping("/eliminarCliente/{idCliente}")
	public void eliminarCliente(@PathVariable Integer idCliente) {
		clienteService.deleteById(idCliente);
		
	}

	@PostMapping(path= "/agregarCliente",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente agregarCliente(@RequestBody Cliente cliente) {
		return (Cliente) clienteService.save(cliente);
		
	}

	@PutMapping(path= "/actualizarCliente",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente modificarCliente(@RequestBody Cliente cliente) {
		return (Cliente) clienteService.save(cliente);
		
	}

}
