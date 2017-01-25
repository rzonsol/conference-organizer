package pl.rzonsol.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.Date;
import java.util.List;

/**
 * Created by rzonsol on 24.01.2017.
 */
@Entity
public class Conference {

    @Id
    private ObjectId id;
    private String name;
    private String location;
    private Date startDate;
    private Date endDate;
    @Reference
    private List<Participant> organizers;
    @Reference
    private List<User> editors;

    public Conference(String name, String location, Date startDate, Date endDate, List<Participant> organizers, List<User> edytors) {
        this.name = name;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.organizers = organizers;
        this.editors = edytors;
    }

    public Conference() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Participant> getOrganizers() {
        return organizers;
    }

    public void setOrganizers(List<Participant> organizers) {
        this.organizers = organizers;
    }

    public List<User> getEditors() {
        return editors;
    }

    public void setEditors(List<User> editors) {
        this.editors = editors;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", organizers=" + organizers +
                ", editors=" + editors +
                '}';
    }
}
