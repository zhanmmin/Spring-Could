package com.ms.provideruser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class Controller {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){

        User userinfo = this.userRepository.findById(id).orElse(null);
        return userinfo;
    }
}
