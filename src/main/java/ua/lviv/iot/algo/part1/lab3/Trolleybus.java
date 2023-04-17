package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@NoArgsConstructor
@Setter
@Getter
public class Trolleybus extends AbstractTransport {
    private int routeNumber;
    private String currentStop;
    private int capacity;
    private int passengers;
    public static final String HEADERS =
            "routeNumber, currentStop, capacity, passengers";


    public Trolleybus(final int id, final int maxSpeed, final int routeNumber, final String currentStop,
                      final int capacity, final int passengers) {
        super(id, maxSpeed);
        this.routeNumber = routeNumber;
        this.currentStop = currentStop;
        this.capacity = capacity;
        this.passengers = passengers;
    }

    public final int stop() {
        return 0;
    }

    public final int start() {
        final int currentSpeed = 20;
        return currentSpeed;
    }

    public final int addPassenger() {
        if (passengers < capacity) {
            passengers += 1;
            return passengers;
        }
        return 0;
    }

    public final void removePassenger() {
        if (passengers == 0) {
            return;
        }
        passengers -= 1;
    }

    public final int accelerate(final int speed) {
        if (getMaxSpeed() < speed) {
            return 0;
        }
        return speed;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    public final String toCSV() {
        return super.toCSV() + ", " + routeNumber + ", "
                + currentStop + ", " + capacity + ", " + passengers;
    }
}
