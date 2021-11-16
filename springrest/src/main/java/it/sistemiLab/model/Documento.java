package it.sistemiLab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 *
 * Model dell'entità Documento.
 *
 *
 * @see it.sistemiLab.dto.DocumentoDTO
 *
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Documento {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true)
	private String nomeDocumento;

	@ManyToOne
	@JoinColumn(name = "nomeProgetto")
	private Progetto progetto;

}
