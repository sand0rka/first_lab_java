package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString(callSuper = true)

public class Tram extends AbstractTransport {
    private int routeNumber;
    private int capacity;

    public Tram(int id, int maxSpeed, int routeNumber, int capacity) {
        super(id, maxSpeed);
        this.routeNumber = routeNumber;
        this.capacity = capacity;
    }

    public int accelerate(int speed) {
        if (maxSpeed < speed) {
            return 0;
        }
        return speed;
    }

}