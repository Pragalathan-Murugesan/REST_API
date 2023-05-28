package com.example.REST_API.WebService;

import com.example.REST_API.WebEntity.LoginEntity;
import com.example.REST_API.WebEntity.SignupEntity;
import com.example.REST_API.WebRepository.LoginRepository;
import com.example.REST_API.WebRepository.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebService implements WebServiceImpl {
    @Autowired
    private WebRepository webRepository;
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public SignupEntity SignUp(SignupEntity signupEntity) {

        return webRepository.save(signupEntity);
    }

    public List<SignupEntity> getAll() {
        return webRepository.findAll();
    }

    @Override

    public Optional<LoginEntity> getById(Long id)  {

        return loginRepository.findById(id);
    }

    public String deleteId(SignupEntity id) {
        webRepository.delete(id);
        return "Deleted sucessfully";
    }

    public SignupEntity updateRecord(Long record)  {

            Optional<SignupEntity> update = webRepository.findById(record);
            SignupEntity updateRecord = update.get();
            updateRecord.setFirstName("Vinoth");
            updateRecord.setLastName("V");
            updateRecord.setEmailId("vinoth@gmail.com");
            updateRecord.setPassword(123455L);

        return webRepository.save(updateRecord);
    }

    public LoginEntity updatePassword(Long id) {
        Optional<LoginEntity> update =loginRepository.findById(id);
        LoginEntity updatePassword=update.get();
        updatePassword.setPassword(123345L);
        return loginRepository.save(updatePassword);
    }

//    public LoginEntity updateName(Long name) {
//        Optional<LoginEntity> updateName = loginRepository.finByName(name);
//
//    }
}
