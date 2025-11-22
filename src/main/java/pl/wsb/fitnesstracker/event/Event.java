package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

// TODO: Define the Event entity with appropriate fields and annotations
@Entity
@Table(name = "event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String country;
    private String city;
}
