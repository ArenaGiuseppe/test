package it.sistemiLab.model;

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
 * @see it.sistemiLab.dto.ProgettoDTO
 *
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
	@JoinColumn(name = "nome_cliente", referencedColumnName = "nomeCLiente")
	private Cliente cliente;

	@OneToMany(mappedBy = "progetto", cascade = CascadeType.ALL)
	private List<Documento> documento;

}