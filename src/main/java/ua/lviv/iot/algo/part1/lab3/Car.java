package ua.lviv.iot.algo.part1.lab3;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class Car extends AbstractTransport {
    private int numberOfDoors;
    private int trunkVolumeInLiters;
    private int maxLoadInTons;

    public Car(final int id, final int maxSpeed, final int numberOfDoors, final int trunkVolumeInLiters, final int maxLoadInTons) {
        super(id, maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.trunkVolumeInLiters = trunkVolumeInLiters;
        this.maxLoadInTons = maxLoadInTons;
    }

    public final int accelerate(final int speed) {
        if (getMaxSpeed() < speed) {
            return 0;
        }
        return speed;
    }
}
