package it.sistemiLab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
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
public class Progetto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true)
	private String nomeProgetto;

	@ManyToOne
	@JsonIgnoreProperties("progetto")
	@JoinColumn(name = "nome_cliente", referencedColumnName = "nomeCLiente")
	private Cliente cliente;

	@OneToMany(mappedBy = "progetto", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("progetto")
	private List<Documento> documento;

}