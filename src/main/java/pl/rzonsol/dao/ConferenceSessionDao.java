package pl.rzonsol.dao;

import org.bson.types.ObjectId;
import pl.rzonsol.model.Conference;
import pl.rzonsol.model.ConferenceSession;
import pl.rzonsol.model.Speaker;

import java.util.List;

/**
 * Created by rzonsol on 25.01.2017.
 */
public interface ConferenceSessionDao {

    void createSession(ConferenceSession conferenceSession);

    void updateSession(ConferenceSession conferenceSession);

    List<ConferenceSession> getSessions(Conference conference);

    List<Speaker> getSessionSpeakers(ObjectId conferenceId);

    void addSpeaker(ObjectId sessionId, Speaker speaker);

    void delateSpeaker(ObjectId sessionId,ObjectId speakerId);
}
