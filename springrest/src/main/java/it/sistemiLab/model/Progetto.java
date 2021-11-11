package it.sistemiLab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * 
 * Model dell'entità Progetto.
 * 
 * 
 * 
 * @see ProgettoDTO
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Progetto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	private String nomeProgetto;

	@ManyToOne
	@JsonIgnoreProperties("progetto")
	private  User user;

	@OneToMany(mappedBy = "progetto", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("progetto")
	private List<Documento> documento;



	
}
