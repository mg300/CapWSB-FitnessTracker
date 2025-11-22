package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.*;
import pl.wsb.fitnesstracker.user.api.User;

// TODO: Define the Event entity with appropriate fields and annotations
@Entity
@Table(name = "user_event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private String status;
}
