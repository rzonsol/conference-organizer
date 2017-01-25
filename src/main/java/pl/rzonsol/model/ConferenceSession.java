package pl.rzonsol.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

/**
 * Created by rzonsol on 24.01.2017.
 */
@Entity
public class ConferenceSession {

    @Id
    private ObjectId id;
    private String name;
    @Reference
    private Conference conference;
    @Reference
    private List<Speaker> listOfSpeakers;


    public ConferenceSession(String name, Conference conference, List<Speaker> listOfSpeakers) {
        this.name = name;
        this.conference = conference;
        this.listOfSpeakers = listOfSpeakers;
    }

    public ConferenceSession() {
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

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public List<Speaker> getListOfSpeakers() {
        return listOfSpeakers;
    }

    public void setListOfSpeakers(List<Speaker> listOfSpeakers) {
        this.listOfSpeakers = listOfSpeakers;
    }

    @Override
    public String toString() {
        return "ConferenceSession{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", conference=" + conference +
                ", listOfSpeakers=" + listOfSpeakers +
                '}';
    }
}
