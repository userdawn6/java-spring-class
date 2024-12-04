package Service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

@Service
public class Userseriveimpl implements UserService {
    @Autowired
     UserRepository userRepository;

    @Override
    public User createUser(User User) {
        return null;
    }

    @Override
    public User updateUser(User User) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

}
