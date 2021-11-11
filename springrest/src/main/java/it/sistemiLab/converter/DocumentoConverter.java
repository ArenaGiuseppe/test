package it.sistemiLab.converter;

import it.sistemiLab.dto.DocumentoDTO;
import it.sistemiLab.model.Documento;
import org.springframework.stereotype.Component;

/**
 * Questa classe implementa i metodi di conversione dell'entità Documento.
 *  
 * 
 * 
 *@see AbstractConverter
 *@see Converter
 */
@Component
public class DocumentoConverter extends AbstractConverter<Documento, DocumentoDTO> {

	@Override
	public Documento toEntity(DocumentoDTO documentoDTO) {
		Documento documento = null;
		if (documentoDTO != null) {
			documento = new Documento(documentoDTO.getId(), documentoDTO.getNomeDocumento(), documentoDTO.getProgetto());
		}
		return documento;
	}

	@Override
	public DocumentoDTO toDTO(Documento documento) {
		DocumentoDTO documentoDTO = null;
		if (documento != null) {
			documentoDTO = new DocumentoDTO(documento.getId(), documento.getNomeDocumento(), documentoDTO.getProgetto());
			
		}
		return documentoDTO;
	}
}