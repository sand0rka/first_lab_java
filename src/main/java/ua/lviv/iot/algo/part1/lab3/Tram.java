package ua.lviv.iot.algo.part1.lab3;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class Tram extends AbstractTransport {
    private int routeNumber;
    private int capacity;

    public Tram(final int id, final int maxSpeed, final int routeNumber, final int capacity) {
        super(id, maxSpeed);
        this.routeNumber = routeNumber;
        this.capacity = capacity;
    }

    public final int accelerate(final int speed) {
        if (getMaxSpeed() < speed) {
            return 0;
        }
        return speed;
    }

}
