package it.sistemiLab.service;

import it.sistemiLab.dto.ClienteDTO;
import it.sistemiLab.model.Cliente;
import org.springframework.stereotype.Service;


/**
 * Estende AbstractService con parametri Cliente e ClienteDTO.
 * Implementa il metodo di login ed eredita quelli Abstract. 
 * 
 * 
 * 
 * @see AbstractService
 * @see ServiceDTO
 */
@Service
public class ClienteService extends AbstractService<Cliente, ClienteDTO> {


}
