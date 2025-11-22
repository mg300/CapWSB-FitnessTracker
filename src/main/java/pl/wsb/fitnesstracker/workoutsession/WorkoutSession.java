package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// TODO: Define the Event entity with appropriate fields and annotations
public class WorkoutSession {

    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "training_id")
    private int trainingId;
    private String timestamp;
    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;
    private double altitude;
}
