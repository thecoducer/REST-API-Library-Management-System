package io.github.thecoducer.restapilms.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.thecoducer.restapilms.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	Optional<Users> findByUserName(String userName);
	Optional<Users> findByEmail(String email);
}
