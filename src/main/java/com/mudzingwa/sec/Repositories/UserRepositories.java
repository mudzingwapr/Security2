package com.mudzingwa.sec.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mudzingwa.sec.model.Role;
import com.mudzingwa.sec.model.User;

public interface UserRepositories extends JpaRepository<User, Integer> {
	Optional<User> findByUsename(String name);
	
	@Modifying
	@Query("update User set role =:role where username=:username")
	void updateUserRole(@Param("username") String username,@Param("role") Role role);

}
