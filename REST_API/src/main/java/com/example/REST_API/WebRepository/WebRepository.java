package com.example.REST_API.WebRepository;

import com.example.REST_API.WebEntity.LoginEntity;
import com.example.REST_API.WebEntity.SignupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WebRepository extends JpaRepository<SignupEntity,Long> {
}



