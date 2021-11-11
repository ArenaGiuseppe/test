package it.sistemiLab.service;

import org.springframework.stereotype.Service;

import it.sistemiLab.dao.UserRepository;
import it.sistemiLab.dto.UserDTO;
import it.sistemiLab.model.User;

/**
 * Estende AbstractService con parametri User e UserDTO. 
 * Implementa il metodo di login ed eredita quelli Abstract. 
 * 
 * 
 * 
 * @see AbstractService
 * @see ServiceDTO
 */
@Service
public class UserService extends AbstractService<User,UserDTO> {
	
	//ALL crud methods in AbstractService
	
	//LOGIN method
	public UserDTO findByUsernameAndPassword(String username, String password) {
		return converter.toDTO(((UserRepository)repository).findByUsernameAndPassword(username, password));
	}

}
