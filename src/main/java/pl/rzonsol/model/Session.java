package pl.rzonsol.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

/**
 * Created by rzonsol on 24.01.2017.
 */
@Entity
public class Session {

    @Id
    private String id;
    private String name;
    @Reference
    private Conference conference;
    @Reference
    private List<Speaker> listOfSpeakers;
}
