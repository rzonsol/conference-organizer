package pl.rzonsol.daoImpl;

import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.beans.factory.annotation.Autowired;
import pl.rzonsol.config.MorphiaService;
import pl.rzonsol.dao.UserDao;
import pl.rzonsol.model.User;

import java.util.List;

/**
 * Created by rzonsol on 29.01.2017.
 */
public class UserDaoImpl extends BasicDAO<User, ObjectId> implements UserDao {


    public UserDaoImpl(Class<User> entityClass, MongoClient mongoClient, Morphia morphia, String dbName) {
        super(entityClass, mongoClient, morphia, dbName);
    }

    public UserDaoImpl(Class<User> entityClass, Datastore ds) {
        super(entityClass, ds);
    }

    protected UserDaoImpl(MongoClient mongoClient, Morphia morphia, String dbName) {
        super(mongoClient, morphia, dbName);
    }

    protected UserDaoImpl(Datastore ds) {
        super(ds);
    }

    @Override
    public List<User> users() {
        return null;
    }

    @Override
    public User findUserById(ObjectId id) {
        return null;
    }

    @Override
    public void upadteUser(User user) {

    }

    @Override
    public List<User> fidnUserByRole(String role) {
        return null;
    }

    @Override
    public void deleteUser(ObjectId id) {

    }
}
