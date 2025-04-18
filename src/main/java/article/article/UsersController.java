package article.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersRepository userRepository;
    
    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<Users> getUsers() {
        return userRepository.findAll();
    }
    
    @PostMapping("/register")
    public Users registerUser(@RequestBody UserRequestDto request) {
        return usersService.createUser(request.getUsername(), request.getPassword());
    }
}

