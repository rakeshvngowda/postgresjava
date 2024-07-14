package postgresjava.example.postgresjava.routes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import postgresjava.example.postgresjava.models.User;
import postgresjava.example.postgresjava.services.UserService;

@RestController
public class Index {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    private static Map Hello() {
        Map<String, Object> response = new HashMap<>(
                Map.of(
                        "Status", 200,
                        "data", "Index pages"));
        return response;
    }

    @PostMapping("/login")
    private Map loginPage() {
        Map<String, Object> response = new HashMap<>(
                Map.of(
                        "Status", 200,
                        "data", "login page"));
        return response;
    }

    @PostMapping("/signup")
    private Map signupPage() {
        Map<String, Object> response = new HashMap<>(
                Map.of(
                        "Status", 200,
                        "data", "signup page"));
        return response;
    }

    @GetMapping("/users")
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}