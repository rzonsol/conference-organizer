package pl.rzonsol.dao;

import org.bson.types.ObjectId;
import pl.rzonsol.model.User;

import java.util.List;

/**
 * Created by rzonsol on 24.01.2017.
 */

public interface UserDao {

    List<User> users();

    void addUser(User user);

    User findUserById(ObjectId id);

    void upadteUser(User user);

    List<User> fidnUserByRole(String role);

    void deleteUser(ObjectId id);
}
