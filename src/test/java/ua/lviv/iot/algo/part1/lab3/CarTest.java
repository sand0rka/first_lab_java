package ua.lviv.iot.algo.part1.lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
    Car car = new Car();
    Car car1 = new Car(2414, 200, 4, 300, 11);

    @Test
    public void testNumberOfDoors() {
        assertEquals(4, car1.getNumberOfDoors());
    }

    @Test
    public void testTrunkVolumeInLiters() {
        assertEquals(300, car1.getTrunkVolumeInLiters());
    }

    @Test
    public void testMaxLoadInTons() {
        assertEquals(11, car1.getMaxLoadInTons());
    }

    @Test
    public void testAccelerate() {
        car.setMaxSpeed(200);
        int speed1 = 120;
        assertEquals(speed1, car.accelerate(speed1));

        int speed2 = 250;
        assertEquals(0, car.accelerate(speed2));
    }

}
