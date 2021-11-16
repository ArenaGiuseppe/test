package it.sistemiLab.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import it.sistemiLab.model.Progetto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO della classe Documento. Ha gli stessi attributi di Documento
 * 
 * 
 * 
 *@see it.sistemiLab.model.Documento
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class DocumentoDTO {

	private long id;
	
	private String nomeDocumento;

	private  Progetto progetto;

}
