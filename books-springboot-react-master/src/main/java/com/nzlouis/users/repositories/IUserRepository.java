package com.nzlouis.users.repositories;


import com.nzlouis.users.models.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/***
 *  @author Louis
 *  Interface IBooksRepository
 */
public interface IUserRepository extends JpaRepository<User, String> {



	Optional<User> findByEmailAndPassword(String email, String password);

	
	
	
}


