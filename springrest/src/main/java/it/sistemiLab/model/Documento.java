package it.sistemiLab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

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
public class Documento implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true)
	private String nomeDocumento;

	@ManyToOne
	@JoinColumn(name = "nome_progetto", referencedColumnName = "nomeProgetto")
	private Progetto progetto;

}
