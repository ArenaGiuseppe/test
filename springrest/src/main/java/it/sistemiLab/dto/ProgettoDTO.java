package it.sistemiLab.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import it.sistemiLab.model.Documento;
import it.sistemiLab.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO della classe Progetto. Ha gli stessi attributi di Progetto
 * 
 * 
 * 
 *@see Documento
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class ProgettoDTO {

	private long id;
	
	private String nomeProgetto;

	private User user;

	private List<Documento> documento;
	

}
