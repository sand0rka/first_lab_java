package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString(callSuper = true)

public class Car extends AbstractTransport {
    private int numberOfDoors;
    private int trunkVolumeInLiters;
    private int maxLoadInTons;

    public Car(int id, int maxSpeed, int numberOfDoors, int trunkVolumeInLiters, int maxLoadInTons) {
        super(id, maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.trunkVolumeInLiters = trunkVolumeInLiters;
        this.maxLoadInTons = maxLoadInTons;
    }

    public int accelerate(int speed) {
        if (maxSpeed < speed) {
            return 0;
        }
        return speed;
    }
}
