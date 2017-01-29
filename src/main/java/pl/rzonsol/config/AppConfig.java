package pl.rzonsol.config;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.rzonsol.daoImpl.RoleDaoImpl;
import pl.rzonsol.daoImpl.UserDaoImpl;
import pl.rzonsol.model.Role;
import pl.rzonsol.model.User;
import pl.rzonsol.services.RoleService;
import pl.rzonsol.services.UserService;

/**
 * Created by rzonsol on 24.01.2017.
 */
@Configuration
@ComponentScan(basePackages = "pl.rzonsol")
public class AppConfig {

    public static final String DB_NAME = "mydb";
    MongoClient mongo = new MongoClient("127.0.0.1", 27017);
    Datastore datastore = new Morphia().mapPackage("pl.rzonsol").createDatastore(mongo, DB_NAME);


    @Bean
    public UserDaoImpl userDao(){
        return new UserDaoImpl(User.class,datastore);
    }

    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public RoleDaoImpl roleDao(){
        return new RoleDaoImpl(Role.class,datastore);
    }

    @Bean
    public RoleService roleService(){
        return new RoleService();
    }
}
