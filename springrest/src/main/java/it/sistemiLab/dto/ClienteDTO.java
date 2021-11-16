package it.sistemiLab.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import it.sistemiLab.model.Progetto;
import it.sistemiLab.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO della classe Progetto. Ha gli stessi attributi di Cliente
 * 
 * 
 * 
 *@see it.sistemiLab.model.Cliente
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class ClienteDTO {

	private long id;

	private String nomeCliente;

	private User user;

	private List<Progetto> progetto;

}





