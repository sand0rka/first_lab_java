package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString(callSuper = true)

public class Bicycle extends AbstractTransport {
    private String bikeBrand;

    public Bicycle(int id, int maxSpeed, String bikeBrand) {
        super(id, maxSpeed);
        this.bikeBrand = bikeBrand;
    }

    public int accelerate(int speed) {
        if (maxSpeed < speed) {
            return 0;
        }
        return speed;
    }
}