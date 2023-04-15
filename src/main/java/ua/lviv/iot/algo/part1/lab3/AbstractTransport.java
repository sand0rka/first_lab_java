package ua.lviv.iot.algo.part1.lab3;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

abstract class AbstractTransport {
    private int id;
    private float maxSpeed;
    public abstract int accelerate(int speed);

}
