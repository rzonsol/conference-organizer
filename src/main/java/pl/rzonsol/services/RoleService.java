package pl.rzonsol.services;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import pl.rzonsol.dao.RoleDao;
import pl.rzonsol.model.Role;

import java.util.List;

/**
 * Created by rzonsol on 29.01.2017.
 */
public class RoleService {

    @Autowired
    RoleDao roleDao;

    public void addRole(Role role) {
        List<Role> roles = getRoles();
        boolean notOnList=true;
        for (Role roleOnList:roles) {
            if (roleOnList.getRole().equals(role.getRole())){
                notOnList=false;
            }
        }
        if (notOnList){
            roleDao.save(role);
        }
    }

    public void deleteRole(ObjectId objectId){
        roleDao.deleteById(objectId);
    }

    public void deleteRole(Role role){
        roleDao.delete(role);
    }

    public List<Role> getRoles(){
        return roleDao.find().asList();
    }

    public Role getRoleById(ObjectId objectId){
        return roleDao.get(objectId);
    }

    public Role getRoleByName(String name){
        return roleDao.findOne("role",name);
    }


}
