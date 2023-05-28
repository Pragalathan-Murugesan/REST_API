package com.example.REST_API.WebService;

import com.example.REST_API.WebEntity.LoginEntity;
import com.example.REST_API.WebEntity.SignupEntity;

import java.util.List;
import java.util.Optional;

public interface WebServiceImpl {
 SignupEntity SignUp(SignupEntity signupEntity) ;

 Optional<LoginEntity> getById(Long id) ;

 String deleteId(SignupEntity id);

 SignupEntity updateRecord(Long record) ;

 LoginEntity updatePassword(Long id);

 List<SignupEntity> getAll();


}
