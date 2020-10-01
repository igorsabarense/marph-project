package marph.marphproject.controller;

import marph.marphproject.entity.User;
import marph.marphproject.repository.UserRepository;
import marph.marphproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@author Igor.Sabarense
*@version 1.0.1
*/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<User> getUser(){
        return userService.getUser();
    }
    
    @GetMappig(value="/{id}", produces = "application/json")
    public @ResponseBody Iterable<User> getUserById(@RequestParam Long id){
        return userService.findUserById(id);
    }
    

    @PostMapping
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);

    }

    @DeleteMapping
    public void deleteUser(@RequestBody User user){
        userService.deleteUser(user);

    }



    @PatchMapping
    public void updateUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
