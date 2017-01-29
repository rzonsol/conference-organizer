package pl.rzonsol.services;

import org.springframework.beans.factory.annotation.Autowired;
import pl.rzonsol.dao.UserDao;
import pl.rzonsol.model.User;

/**
 * Created by rzonsol on 29.01.2017.
 */
public class UserService {

    @Autowired
    UserDao userDao;

    public void addUser(User user){
        userDao.save(user);
    }
}
