package pl.rzonsol.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.sql.Time;
import java.util.Date;

/**
 * Created by rzonsol on 24.01.2017.
 */
@Entity
public class Speaker extends Participant {


    @Id
    private ObjectId id;
    private String title;
    private String talkAbstract;
    private Date dateOfSpeech;
    private Time timeOfSpeech;

    public Speaker(String firstName, String lastName, String email, Conference conference, String affiliation, Date arriveDate, Date departureDate, boolean confirmed, boolean paid, String title, String anAbstract, Date dateOfSpeech, Time timeOfSpeech) {
        super(firstName, lastName, email, conference, affiliation, arriveDate, departureDate, confirmed, paid);
        this.title = title;
        talkAbstract = anAbstract;
        this.dateOfSpeech = dateOfSpeech;
        this.timeOfSpeech = timeOfSpeech;
    }

    public Speaker(String title, String anAbstract, Date dateOfSpeech, Time timeOfSpeech) {
        this.title = title;
        talkAbstract = anAbstract;
        this.dateOfSpeech = dateOfSpeech;
        this.timeOfSpeech = timeOfSpeech;
    }

    public Speaker(){}

    @Override
    public ObjectId getId() {
        return id;
    }

    @Override
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTalkAbstract() {
        return talkAbstract;
    }

    public void setTalkAbstract(String talkAbstract) {
        this.talkAbstract = talkAbstract;
    }

    public Date getDateOfSpeech() {
        return dateOfSpeech;
    }

    public void setDateOfSpeech(Date dateOfSpeech) {
        this.dateOfSpeech = dateOfSpeech;
    }

    public Time getTimeOfSpeech() {
        return timeOfSpeech;
    }

    public void setTimeOfSpeech(Time timeOfSpeech) {
        this.timeOfSpeech = timeOfSpeech;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "title='" + title + '\'' +
                ", talkAbstract='" + talkAbstract + '\'' +
                ", dateOfSpeech=" + dateOfSpeech +
                ", timeOfSpeech=" + timeOfSpeech +
                "} " + super.toString();
    }
}
