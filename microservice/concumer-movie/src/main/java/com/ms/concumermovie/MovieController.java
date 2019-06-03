package com.ms.concumermovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController      //必须有的，表述性状态传递。没有的话web传递不过来。
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        System.out.println(id);
        User info = this.restTemplate.getForObject("http://localhost:8000/"+id,User.class);
        System.out.println(info);
        return info;
    }


}
