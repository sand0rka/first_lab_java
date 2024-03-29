package ua.lviv.iot.algo.part1.lab2;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class Trolleybus extends AbstractTransport {
    private int routeNumber;
    private String currentStop;
    private int capacity;
    private int passengers;

    public Trolleybus( int id,  int maxSpeed, int routeNumber, String currentStop, int capacity, int passengers) {
        super(id,maxSpeed);
        this.routeNumber = routeNumber;
        this.currentStop = currentStop;
        this.capacity = capacity;
        this.passengers = passengers;
    }

    public void stop() {
        float currentSpeed = 0;
    }

    public void start() {
        float currentSpeed = 20;
    }

    public int addPassenger() {
        if (passengers < capacity) {
            passengers += 1;
            return passengers;
        }
        return 0;
    }

    public void removePassenger() {
        if (passengers == 0) {
            return;
        }
        passengers -= 1;
    }

    public int accelerate(int speed) {
        return speed;
    }
}