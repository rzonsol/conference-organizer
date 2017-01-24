package pl.rzonsol.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by rzonsol on 24.01.2017.
 */
@Entity
public class Role {


    @Id
    private ObjectId id;
    private String role;

    public Role(ObjectId id, String role) {
        this.id = id;
        this.role = role;
    }

    public Role() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
