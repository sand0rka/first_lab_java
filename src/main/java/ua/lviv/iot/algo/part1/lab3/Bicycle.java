package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Bicycle extends AbstractTransport {
    private String bikeBrand;

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
}
