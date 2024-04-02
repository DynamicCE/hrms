package kodlamaio.hrms.api.controllers.userControllers;


import kodlamaio.hrms.business.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public
class UserController {
@Autowired
private UserService userService;

}
