package io.github.thecoducer.restapilms.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.thecoducer.restapilms.models.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	Optional<Users> findByUserName(String userName);
}
