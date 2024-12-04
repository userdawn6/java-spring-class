package repository;

import org.springframework.stereotype.Repository;
import model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository  {
    User findByUsername(String username);

    List<User> findAll();
    Optional<User> findById(Long id);




/*//    these methods where generated to fix 2 errors in the userrepositoryimpl
    User save(User user);

    List<User> findAll();

//    this is the end of the generated methods*/
}


