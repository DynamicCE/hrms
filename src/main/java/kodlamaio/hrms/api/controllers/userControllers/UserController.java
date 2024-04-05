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
class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok ( userService.getAll () );
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUser( @PathVariable Long id){
        if(userService.findById ( id ).isPresent ( )){
            return ResponseEntity.ok ( userService.findById ( id ) );
        }else{
            return ResponseEntity.notFound ().build ();
        }
    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser){
        userService.saveUser ( newUser );
        return ResponseEntity.ok (newUser);
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User updatedUser){
        userService.saveUser (updatedUser);
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        userService.deleteUser ( id );
        return (ResponseEntity<User>) ResponseEntity.ok ();
    }

}
