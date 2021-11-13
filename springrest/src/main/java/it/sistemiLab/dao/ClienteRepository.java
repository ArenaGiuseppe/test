package it.sistemiLab.dao;

import it.sistemiLab.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ClienteRepository extends CrudRepository <Cliente, Long> {

}