package pl.dudecode.JPAdemo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(long id) {
        return userRepository.findById(id).orElse(new User());
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> findByIds(List<Long> ids) {
        return userRepository.findByIdIn(ids);
    }

    public Iterable<User> findAllById() {
        return userRepository.findAllById(Arrays.asList(1L, 2L));
    }
}
