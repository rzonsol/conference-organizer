package pl.rzonsol.dao;

import org.bson.types.ObjectId;
import pl.rzonsol.model.Participant;

import java.util.Date;
import java.util.List;

/**
 * Created by rzonsol on 25.01.2017.
 */
public interface ParticipantDao {

    void addParticipant(Participant participant);

    List<Participant> participants();

    void deleteParticipant(ObjectId id);

    Participant getParticipant(ObjectId id);

    void updateParticipant(Participant participant);

    void updateDateArriveDeparture(Date arriveDate, Date departureDate);

    void confirmed(ObjectId id);
}
