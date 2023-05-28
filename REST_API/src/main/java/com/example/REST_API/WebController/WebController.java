package com.example.REST_API.WebController;

import com.example.REST_API.WebEntity.LoginEntity;
import com.example.REST_API.WebEntity.SignupEntity;
import com.example.REST_API.WebService.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/webApp")
public class WebController {
       @Autowired
       private WebServiceImpl webService;

       @PostMapping(value = "/signUp")
    public SignupEntity SignUp(@RequestBody SignupEntity signupEntity) throws Exception {
        return webService .SignUp(signupEntity);
    }
    @GetMapping(value = "/getAll")
    public List<SignupEntity> getAll(){
           return webService.getAll();
    }
   @GetMapping(value = "/getById/{id}")
   public  Optional<LoginEntity> getById(@PathVariable("id") Long id) throws Exception {
           return webService.getById(id);
   }

//    @GetMapping(value = "/getById")
//    public  Optional<LoginEntity> getById(@RequestParam("id") Long id) throws Exception {
//        return webService.getById(id);
//    }

    @DeleteMapping(value = "/deleteId/{id}")
    public String deleteId( @PathVariable("id") SignupEntity id){
           return webService.deleteId(id);
    }

    @PutMapping(value = "/updateRecord/{record}")
    public SignupEntity updateRecord(@PathVariable("record") Long record ) throws Exception {
           return webService.updateRecord(record);
    }

    @PatchMapping (value = "updatePassword/{id}")
    public LoginEntity updatePassword(@PathVariable("id") Long id){
           return webService.updatePassword(id);
    }


}
