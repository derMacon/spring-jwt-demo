package com.dermacon.tokengenerator.repository;

import com.dermacon.tokengenerator.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<User, Long> {
    Optional<User> findOneByUsername(String username);
}
