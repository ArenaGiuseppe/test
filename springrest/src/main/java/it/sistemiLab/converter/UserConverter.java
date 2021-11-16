package it.sistemiLab.converter;

import org.springframework.stereotype.Component;

import it.sistemiLab.dto.UserDTO;

import it.sistemiLab.model.User;

/**
 * Questa classe implementa i metodi di conversione dell'entità User.
 *  
 * 
 * 
 *@see AbstractConverter
 *@see Converter
 */
@Component
public class UserConverter extends AbstractConverter<User,UserDTO> {

	@Override
	public User toEntity(UserDTO userDTO) {
		User user = null;
		if (userDTO != null) {
			user = new User(userDTO.getId(), userDTO.getUsername(), userDTO.getPassword(),userDTO.getNome(),
					userDTO.getCognome(), userDTO.getCliente(), userDTO.getUsertype());
		}
		return user;
	}

	@Override
	public UserDTO toDTO(User user) {
		UserDTO userDTO = null;
		if (user != null) {
			userDTO = new UserDTO(user.getId(),user.getUsername(),user.getPassword(),user.getNome(),
					user.getCognome(), user.getCliente(), user.getUsertype());
		}
		return userDTO;
	}
}