package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.Getter;

@NoArgsConstructor
@Getter
public class Bicycle extends AbstractTransport {
    private String bikeBrand;
    public static final String HEADERS = "bikeBrand";


    public Bicycle(final int id, final int maxSpeed, final String bikeBrand) {
        super(id, maxSpeed);
        this.bikeBrand = bikeBrand;
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
        return super.toCSV() + ", " + bikeBrand;
    }
}
