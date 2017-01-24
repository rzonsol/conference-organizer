package pl.rzonsol.dao;

import org.bson.types.ObjectId;
import pl.rzonsol.model.Conference;
import pl.rzonsol.model.Participant;
import pl.rzonsol.model.User;

import java.util.List;

/**
 * Created by rzonsol on 24.01.2017.
 */
public interface ConferenceDao {

    List<Conference> listOfConferences();

    Void addConference(Conference conference);

    Void updateaddConference(Conference conference);

    List<Participant> getParticipant(ObjectId conferenceId);

    List<User> getEdytors(ObjectId conferenceId);

    Conference getConference(ObjectId conferenceId);

    void deleteConference(ObjectId conferenceId);

    List<Conference> getEdytorsConference(ObjectId edytorId);

}
