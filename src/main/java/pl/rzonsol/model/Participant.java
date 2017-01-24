package pl.rzonsol.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.Date;

/**
 * Created by rzonsol on 24.01.2017.
 */

@Entity
public class Participant {

    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
    @Reference
    private Conference conference;
    private String affiliation;
    private Date arriveDate;
    private Date departureDate;
    private boolean confirmed;
    private boolean paid;

    public Participant(String firstName, String lastName, String email, Conference conference, String affiliation, Date arriveDate, Date departureDate, boolean confirmed, boolean paid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.conference = conference;
        this.affiliation = affiliation;
        this.arriveDate = arriveDate;
        this.departureDate = departureDate;
        this.confirmed = confirmed;
        this.paid = paid;
    }

    public Participant() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", conference=" + conference +
                ", affiliation='" + affiliation + '\'' +
                ", arriveDate=" + arriveDate +
                ", departureDate=" + departureDate +
                ", confirmed=" + confirmed +
                ", paid=" + paid +
                '}';
    }
}
