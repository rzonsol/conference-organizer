package pl.rzonsol.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;
import pl.rzonsol.model.Role;

/**
 * Created by rzonsol on 29.01.2017.
 */
public interface RoleDao extends DAO<Role, ObjectId> {

}
