package marph.marphproject.service;

import marph.marphproject.entity.User;
import marph.marphproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<User> getUser(){
        Iterable<User> user = userRepository.findAll();
        return user;
    }

    @Transactional
    public void saveUser(User user){
        userRepository.save(user);
    }

    @Transactional
    public void deleteUser(User user){
        userRepository.delete(user);
    }



    public void updateUser(User user){
        userRepository.save(user);
    }




}
