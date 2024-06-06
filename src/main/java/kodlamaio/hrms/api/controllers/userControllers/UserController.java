package kodlamaio.hrms.api.controllers.userControllers;


import java.util.List;

import jakarta.validation.Valid;
import kodlamaio.hrms.business.services.token.abstracts.TokenService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.userEntities.User;

@RestController
@RequestMapping("/api/users/")
public
class UserController {

    private UserService userService;
    private
    TokenService tokenService;

    public
    UserController ( UserService userService ) {
        this.userService = userService;
    }

    @GetMapping("findByEmail")
    ResponseEntity<DataResult<User>> findByEmail ( @RequestParam String email ) {
        DataResult<User> result = userService.findByEmail ( email );
        return ResponseEntity.ok ( result );
    }

    @PostMapping(value = "add")
    ResponseEntity<DataResult<User>> add ( @Valid @RequestBody User user ) {
        DataResult<User> result = userService.add ( user );
        return ResponseEntity.ok ( result );
    }

    @GetMapping("findByEmailContains")
    ResponseEntity<DataResult<List<User>>> findByEmailContains ( @RequestParam String email ) {
        DataResult<List<User>> result = userService.findByEmailContains ( email );
        return ResponseEntity.ok ( result );
    }

    @GetMapping("findByEmailStartsWith")
    ResponseEntity<DataResult<List<User>>> findByEmailStartsWith ( @RequestParam String email ) {
        DataResult<List<User>> result = userService.findByEmailStartsWith ( email );
        return ResponseEntity.ok ( result );
    }

    @GetMapping("findByEmailEndsWith")
    ResponseEntity<DataResult<List<User>>> findByEmailEndsWith ( @RequestParam String email ) {
        DataResult<List<User>> result = userService.findByEmailEndsWith ( email );
        return ResponseEntity.ok ( result );

    }

    @GetMapping("verifyEmail")
    ResponseEntity<Result> verifyEmail ( @RequestParam String token ) {
        Result result = tokenService.validateToken ( token );
        return ResponseEntity.ok ( result );
    }

}
