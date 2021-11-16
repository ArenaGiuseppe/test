package it.sistemiLab.converter;

import it.sistemiLab.dto.ClienteDTO;
import it.sistemiLab.model.Cliente;
import org.springframework.stereotype.Component;

/**
 * Questa classe implementa i metodi di conversione dell'entità Cliente.
 *  
 * 
 * 
 *@see AbstractConverter
 *@see Converter
 */
@Component
public class ClienteConverter extends AbstractConverter<Cliente, ClienteDTO> {

	@Override
	public Cliente toEntity(ClienteDTO clienteDTO) {
		Cliente cliente = null;
		if (clienteDTO != null) {
			cliente = new Cliente(clienteDTO.getId(), clienteDTO.getNomeCliente(), clienteDTO.getUser(), clienteDTO.getProgetto());
		}
		return cliente;
	}

	@Override
	public ClienteDTO toDTO(Cliente cliente) {
		ClienteDTO clienteDTO = null;
		if (cliente != null) {
			clienteDTO = new ClienteDTO(cliente.getId(), cliente.getNomeCliente(), clienteDTO.getUser(), cliente.getProgetto());
			
		}
		return clienteDTO;
	}
}