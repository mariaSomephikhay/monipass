package com.unla.monipass.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.unla.monipass.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	public Optional<User> findById(String id);
}
