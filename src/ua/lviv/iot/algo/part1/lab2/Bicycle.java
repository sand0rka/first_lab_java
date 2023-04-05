package ua.lviv.iot.algo.part1.lab2;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class Bicycle extends AbstractTransport{
    private String bikeBrand;

    public Bicycle(int id, int maxSpeed, String bikeBrand){
        super(id, maxSpeed);
        this.bikeBrand = bikeBrand;
    }
    public int accelerate(int speed) {
        return speed;
    }

}