package pl.rzonsol.daoImpl;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import pl.rzonsol.dao.RoleDao;
import pl.rzonsol.model.Role;

/**
 * Created by rzonsol on 29.01.2017.
 */
public class RoleDaoImpl extends BasicDAO<Role, ObjectId> implements RoleDao {
    public RoleDaoImpl(Class<Role> entityClass, Datastore ds) {
        super(entityClass, ds);
    }
}
