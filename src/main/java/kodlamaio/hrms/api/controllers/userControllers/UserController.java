package kodlamaio.hrms.api.controllers.userControllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public
    List<User> getAll () {
        return userService.getAll ( );
    }

    @GetMapping("/api/id")
    public
    Optional<User> getUser ( @PathVariable int id ) {
        return userService.findById ( id );
    }
}
