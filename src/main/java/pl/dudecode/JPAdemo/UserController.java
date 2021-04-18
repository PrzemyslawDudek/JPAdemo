package pl.dudecode.JPAdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @GetMapping("/find_by_username")
    public String findByUsername() {
        return userService.findByUsername("user2").toString();
    }

    @ResponseBody
    @GetMapping("/find_by_id/{id}")
    public String findById(@PathVariable("id") long id) {
        return userService.findById(id).toString();
    }

    @ResponseBody
    @GetMapping("/find_by_ids")
    public String findByIds() {
        return userService.findByIds(Arrays.asList(1L, 5L)).toString();
    }

    @ResponseBody
    @GetMapping("/find_all_by_id")
    public String findAllById() {
        return userService.findAllById().toString();
    }
}
