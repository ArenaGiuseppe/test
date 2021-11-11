package it.sistemiLab.service;

import it.sistemiLab.dao.ProgettoRepository;
import it.sistemiLab.dto.ProgettoDTO;
import it.sistemiLab.model.Progetto;
import it.sistemiLab.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ProgettoService extends AbstractService<Progetto, ProgettoDTO> {

	public ProgettoDTO findByNomeProgetto(String nomeProgetto) {
		return converter.toDTO(((ProgettoRepository)repository).findByNomeProgetto(nomeProgetto));
	}
}
