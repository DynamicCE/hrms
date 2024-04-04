package kodlamaio.hrms.api.controllers.userControllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Optional<User>> getUser( @PathVariable int id){
        if(userService.findById ( id ) != null){
            return ResponseEntity.ok ( userService.findById ( id ) );
        }else{
            return ResponseEntity.notFound ().build ();
        }
    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser){
        userService.createUser ( newUser.getId ( ) );
        return ResponseEntity.ok (newUser);
    }


}
