package com.javaweb.javaweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.javaweb.entities.User;
import com.javaweb.javaweb.repository.UserRepository;

//Caminho para requisição
@RestController
@RequestMapping(value = "/users")
public class UserControllers {

    @Autowired
    private UserRepository userRepository;
    
    //Métado para Listar todos os usuários
    @GetMapping
    public List<User> findAll(){
        List<User> result = userRepository.findAll();
        return result;
    }

    //Métado para Listar um ID específico
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result = userRepository.findById(id).get();
        return result;
    }

    //Métado para add um novo usuário
    @PostMapping
    public User insert(@RequestBody User user){
        User result = userRepository.save(user);
        return result;
    }
}
