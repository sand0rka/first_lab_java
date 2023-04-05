package ua.lviv.iot.algo.part1.lab2;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class Car extends AbstractTransport {
    private int numberOfDoors;
    private float trunkVolumeInLiters;
    private float maxLoadInTons;

    public Car(int id, int maxSpeed, int numberOfDoors, float trunkVolumeInLiters, float maxLoadInTons){
        super(id,maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.trunkVolumeInLiters = trunkVolumeInLiters;
        this.maxLoadInTons = maxLoadInTons;
    }

    public int accelerate(int speed) {
        return speed;
    }
}
