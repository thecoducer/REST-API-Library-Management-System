package io.github.thecoducer.restapilms.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.github.thecoducer.restapilms.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	Optional<Users> findByUserName(String userName);
	Optional<Users> findByEmail(String email);
	
	@Query("SELECT u FROM Users u WHERE u.enabled = 1")
	List<Users> findAllActiveUsers();
	
	@Query("SELECT u FROM Users u WHERE u.enabled = 0")
	List<Users> findAllDisabledUsers();
	
	@Query("SELECT u FROM Users u")
	List<Users> showAllUsers();
	
}
