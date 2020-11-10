package com.dermacon.securewebapp.repository;

import com.dermacon.securewebapp.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<Account, String> {
    Optional<Account> findOneByUsername(String username);
}
