package com.gitub.alcemirjunior.spiringMongoDB.services;

import com.gitub.alcemirjunior.spiringMongoDB.domain.User;
import com.gitub.alcemirjunior.spiringMongoDB.dto.UserDTO;
import com.gitub.alcemirjunior.spiringMongoDB.repository.UserRepository;
import com.gitub.alcemirjunior.spiringMongoDB.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert (User obj){
        return userRepository.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

    public void delete (String id){
        findById(id);
        userRepository.deleteById(id);
    }
}
