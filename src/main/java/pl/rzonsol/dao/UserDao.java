package pl.rzonsol.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;
import pl.rzonsol.model.User;

import java.util.List;

/**
 * Created by rzonsol on 24.01.2017.
 */

public interface UserDao extends DAO<User, ObjectId> {

    List<User> users();

    User findUserById(ObjectId id);

    void upadteUser(User user);

    List<User> fidnUserByRole(String role);

    void deleteUser(ObjectId id);
}
