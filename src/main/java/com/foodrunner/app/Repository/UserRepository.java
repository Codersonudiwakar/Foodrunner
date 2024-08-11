package com.foodrunner.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
	
	 User findByEmail(String email);
}
