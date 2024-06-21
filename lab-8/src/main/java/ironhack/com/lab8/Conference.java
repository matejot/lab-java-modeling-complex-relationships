package ironhack.com.lab8;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
/*  1St Version
public class Conference extends Event {
        // Additional Exposition-specific fields can be added here.
    public Conference() {
        super();
    }
    public Conference(LocalDate date, int duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }
}
*/

//Edited Version from last Part
public class Conference extends Event {

    @OneToMany
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;

    public Conference(LocalDate date, int duration, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(date, duration, location, title, guests);
        this.speakers = speakers;
    }
}