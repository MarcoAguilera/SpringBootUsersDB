package com.example.springbootmongodbexample.resource;
import java.util.List;

import com.example.springbootmongodbexample.document.Users;
import com.example.springbootmongodbexample.repo.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")

public class UsersResource{
    @Autowired
    private UsersRepository repo;
    
    @CrossOrigin(origins = "*")
    @GetMapping("/all")
    public List<Users> getAll(){
        System.out.println("sgetting all users");
        return repo.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/create")
    public Users postUser(@RequestBody Users user){
        Users _user = repo.save(new Users(user.getUserName(), user.getPassword()));
        return _user;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/update")
    public Users updateUser(@RequestBody Users user){
        Users _user = repo.save(user);
        return _user;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
		System.out.println("Delete User with ID = " + id + "...");
 
		repo.deleteById(id);
 
		return new ResponseEntity<>("User has been deleted!", HttpStatus.OK);
	}
}