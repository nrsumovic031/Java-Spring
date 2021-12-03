package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.model.request.RequestPutUser;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/getUserProfile")
    public ResponseEntity<User> getUserProfile(@RequestParam int id) throws FileNotFoundException {
        User user = userRepository.findById(id);
        System.out.println("user");
        System.out.println(user);
        if(user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }
    @GetMapping("/getAllUserProfiles")
    public ResponseEntity<List<User>> getAllUserProfiles(){
        List<User> users = userRepository.findAll();
        System.out.println("users");
        System.out.println(users);
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("/deleteUserProfile/{id}")
    public ResponseEntity<Integer> deleteUserProfile(@PathVariable(value = "id") int id){
        User user = userRepository.findById(id);
        if(user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            userRepository.delete(user);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
    }
    @PutMapping("/updateUserProfile/{id}")
    public ResponseEntity<User> updateUserProfile(@PathVariable(value = "id") int id, @RequestBody RequestPutUser requestPutUser){
        User user = userRepository.findById(id);
        System.out.println("user PUT");
        System.out.println(user);
        System.out.println("requestPutUser");
        System.out.println(requestPutUser.getAddress());
        if(user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{

            user.setUsername(requestPutUser.getUsername());
            user.setPassword(requestPutUser.getPassword());
            user.setAddress(requestPutUser.getAddress());

            System.out.println("user PUT after");
            System.out.println(user);
            User userUpdate = userRepository.save(user);
            return new ResponseEntity<>(userUpdate, HttpStatus.OK);
        }
    }



}
