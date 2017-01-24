package pl.rzonsol.model;

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
    private String id;
    private String name;
    private String location;
    private Date startDate;
    private Date endDate;
    @Reference
    private List<Participant> organizers;
    @Reference
    private List<User> edytors;

    public Conference(String name, String location, Date startDate, Date endDate, List<Participant> organizers, List<User> edytors) {
        this.name = name;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.organizers = organizers;
        this.edytors = edytors;
    }

    public Conference() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public List<User> getEdytors() {
        return edytors;
    }

    public void setEdytors(List<User> edytors) {
        this.edytors = edytors;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", organizers=" + organizers +
                ", edytors=" + edytors +
                '}';
    }
}
