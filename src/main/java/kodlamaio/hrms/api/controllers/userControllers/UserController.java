package kodlamaio.hrms.api.controllers.userControllers;


import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.core.DataResult;
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
@RequestMapping("/api/users/")
public
class UserController {

    private UserService userService;

    public
    UserController ( UserService userService ) {
        this.userService = userService;
    }

    @GetMapping("findByEmail")
    DataResult<User> findByEmail( String email){
        return userService.findByEmail ( email );
    }
    @GetMapping("findByUserName")
    DataResult<List<User>> findByUserName( String userName){
        return userService.findByUserName ( userName );
    }
    @GetMapping("findByUserNameContains")
    DataResult<List<User>> findByUserNameContains(String userName){
        return userService.findByUserNameContains ( userName );
    }
    @GetMapping("findByUserNameStartsWith")
    DataResult<List<User>> findByUserNameStartsWith(String userName){
        return userService.findByUserNameStartsWith (userName  );
    }
    @GetMapping("findByUserNameEndsWith")
    DataResult<List<User>> findByUserNameEndsWith(String userName){
        return userService.findByUserNameEndsWith ( userName );
    }

}
