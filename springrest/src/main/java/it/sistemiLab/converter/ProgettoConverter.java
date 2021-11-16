package it.sistemiLab.converter;

import it.sistemiLab.dto.ProgettoDTO;
import it.sistemiLab.model.Progetto;
import org.springframework.stereotype.Component;

/**
 * Questa classe implementa i metodi di conversione dell'entità Progetto.
 *  
 * 
 * 
 *@see AbstractConverter
 *@see Converter
 */
@Component
public class ProgettoConverter extends AbstractConverter<Progetto, ProgettoDTO> {

	@Override
	public Progetto toEntity(ProgettoDTO progettoDTO) {
		Progetto progetto = null;
		if (progettoDTO != null) {
			progetto = new Progetto(progettoDTO.getId(), progettoDTO.getNomeProgetto(), progetto.getCliente(), progettoDTO.getDocumento());
		}
		return progetto;
	}

	@Override
	public ProgettoDTO toDTO(Progetto progetto) {
		ProgettoDTO progettoDTO = null;
		if (progetto != null) {
			progettoDTO = new ProgettoDTO(progetto.getId(), progetto.getNomeProgetto(), progetto.getCliente(), progetto.getDocumento());
			
		}
		return progettoDTO;
	}
}