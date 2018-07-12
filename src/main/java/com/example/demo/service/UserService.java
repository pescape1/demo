package com.example.demo.service;

import java.util.List;
import com.example.demo.model.User;

public interface UserService {

	/** 
	 * Guardar un usuario
	 * @param user
	 * @return usuario
	 */
	User save(User user);

	/**
	 * recupera lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();

	/**
	 * Eliminar un usuario con id recibido
	 * @param id
	 */
	void deleteUser(Long id);

}
