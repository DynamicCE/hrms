package kodlamaio.hrms.api.controllers.userControllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.userEntities.User;

@RestController
@RequestMapping("/api/users")
public
class UserController<T> {
    @Autowired
    private UserService userService;

    @GetMapping
    public List getAll(){
        return userService.getAll ();
    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        user = userService.createUser ( user );
        return ResponseEntity.ok (user);
    }

}
