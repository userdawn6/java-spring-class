package Service;

import model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

    User createUser(User User);

    User updateUser (User User);

    List<User> getUsers();

}
