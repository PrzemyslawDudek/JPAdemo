package pl.dudecode.JPAdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {

    private final UserRepository userRepository;

    public DbInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> dummyUsers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User dummyUser = new User();
            dummyUser.setUsername("user-" + (i + 1));
            dummyUsers.add(dummyUser);
        }
        userRepository.saveAll(dummyUsers);

    }

}
