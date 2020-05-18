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
	
	@Query(value = "select * from users where enabled = 1", nativeQuery = true)
	List<Users> findAllActiveUsers();
	
	@Query(value = "select * from users where enabled = 0", nativeQuery = true)
	List<Users> findAllDisabledUsers();
	
	@Query(value = "select * from users", nativeQuery = true)
	List<Users> showAllUsers();
	
}
