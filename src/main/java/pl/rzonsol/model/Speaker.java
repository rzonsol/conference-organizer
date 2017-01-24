package pl.rzonsol.model;

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
    private String id;
    private String title;
    private String Abstract;
    private Date dateOfSpeech;
    private Time timeOfSpeech;

    public Speaker(String firstName, String lastName, String email, Conference conference, String affiliation, Date arriveDate, Date departureDate, boolean confirmed, boolean paid, String title, String anAbstract, Date dateOfSpeech, Time timeOfSpeech) {
        super(firstName, lastName, email, conference, affiliation, arriveDate, departureDate, confirmed, paid);
        this.title = title;
        Abstract = anAbstract;
        this.dateOfSpeech = dateOfSpeech;
        this.timeOfSpeech = timeOfSpeech;
    }

    public Speaker(String title, String anAbstract, Date dateOfSpeech, Time timeOfSpeech) {
        this.title = title;
        Abstract = anAbstract;
        this.dateOfSpeech = dateOfSpeech;
        this.timeOfSpeech = timeOfSpeech;
    }

    public Speaker(){}

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String anAbstract) {
        Abstract = anAbstract;
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
                ", Abstract='" + Abstract + '\'' +
                ", dateOfSpeech=" + dateOfSpeech +
                ", timeOfSpeech=" + timeOfSpeech +
                "} " + super.toString();
    }
}
