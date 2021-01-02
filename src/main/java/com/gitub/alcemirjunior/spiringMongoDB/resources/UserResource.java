package com.gitub.alcemirjunior.spiringMongoDB.resources;

import com.gitub.alcemirjunior.spiringMongoDB.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity <List<User>> findAll(){
        User maria = new User("1","maria","maria@gmail.com");
        User mario = new User("2","mario","mario@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria,mario));
        return ResponseEntity.ok().body(list);
    }
}
