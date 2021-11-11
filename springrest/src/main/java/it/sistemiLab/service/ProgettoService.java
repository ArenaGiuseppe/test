package it.sistemiLab.service;

import it.sistemiLab.dao.ProgettoRepository;
import it.sistemiLab.dto.ProgettoDTO;
import it.sistemiLab.model.Progetto;
import org.springframework.stereotype.Service;

/**
 * Estende AbstractService con parametri Progetto e ProgettoDTO.
 * Implementa il metodo di login ed eredita quelli Abstract. 
 * 
 * 
 * 
 * @see AbstractService
 * @see ServiceDTO
 */
@Service
public class ProgettoService extends AbstractService<Progetto, ProgettoDTO> {
	
	//ALL crud methods in AbstractService
	
	//ricerca by nome
	public ProgettoDTO findByNome(String nomeProgetto) {
		return converter.toDTO(((ProgettoRepository)repository).findByNome(nomeProgetto));
	}

}
