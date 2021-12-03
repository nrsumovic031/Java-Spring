package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.request.RequestUser;
import com.example.demo.repository.UserRepository;
import com.example.demo.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signIn")
    public String genToken(@RequestBody RequestUser requestUser) throws Exception {
        System.out.println("requestUser");
        System.out.println(requestUser);
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(requestUser.getUsername(), requestUser.getPassword())
            );
        }catch (Exception ex){
            throw new Exception("invalid username or/and password");
        }
        return jwtUtils.generateToken(requestUser.getUsername());
    }

    @PostMapping("/signUp")
    public String signUp(@RequestBody User user){
        User u = userRepository.findByUsername(user.getUsername());
//        System.out.println("user");
//        System.out.println(u);
        if(u == null){
//            Ovde treba dodati validatore
            userRepository.save(user);
            return "User successfully Sign Up";
        }else{
            return "User with this username already exists";
        }
    }

}
