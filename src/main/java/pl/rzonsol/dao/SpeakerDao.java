package pl.rzonsol.dao;

import org.bson.types.ObjectId;
import pl.rzonsol.model.Speaker;

import java.sql.Time;
import java.util.Date;

/**
 * Created by rzonsol on 25.01.2017.
 */
public interface SpeakerDao {

    void addSpeaker(Speaker speaker);

    void deleteSpeaker(ObjectId speakerId);

    void updateSpeaker(Speaker speaker);

    Speaker getSpeaker(ObjectId speakerId);

    void addTalkDetails(ObjectId speakerId, String title, String talkAbstract);

    void updateTimeOfSpeech(ObjectId speakerId, Date date, Time time);
}
