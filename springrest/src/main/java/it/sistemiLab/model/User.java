package it.sistemiLab.model;

import javax.persistence.Entity;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 * Model dell'entità User. Contiene l'enum che definisce gli usertype (salvati come interi
 * a partire da 0 sul db).
 *
 *
 *
 * @see it.sistemiLab.dto.UserDTO
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public enum Usertype {
        UTENTE,
        CLIENTE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;

    @Column
    private String nome;

    @Column
    private String cognome;

    @Column
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Cliente> cliente;

    @Column
    private Usertype usertype;


}