package it.sistemiLab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


/**
 *
 * Model dell'entità Cliente.
 *
 * @see it.sistemiLab.dto.ClienteDTO
 *
 *
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String nomeCliente;

    @ManyToOne
    @JoinColumn(name = "nome_utente", referencedColumnName = "nome")
    private User user;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Progetto> progetto;
}