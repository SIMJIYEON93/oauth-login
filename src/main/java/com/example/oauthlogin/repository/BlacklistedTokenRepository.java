package com.example.oauthlogin.repository;

import com.example.oauthlogin.entity.BlacklistedToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlacklistedTokenRepository extends CrudRepository<BlacklistedToken, String> {
}
