package ua.lviv.iot.algo.part1.lab3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

abstract class AbstractTransport {
    private int id;
    private float maxSpeed;
    public static final String HEADERS = "id, maxSpeed";


    public abstract int accelerate(int speed);

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return id + ", " + maxSpeed;
    }
}
