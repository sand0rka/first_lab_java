package ua.lviv.iot.algo.part1.lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BicycleTest {
    Bicycle bicycle = new Bicycle();
    Bicycle bicycle1 = new Bicycle(247, 40, "Kellys");

    @Test
    public void testBikeBrand() {
        assertEquals("Kellys", bicycle1.getBikeBrand());
    }

    @Test
    public void testAccelerate() {
        bicycle.setMaxSpeed(30);
        int speed1 = 25;
        assertEquals(speed1, bicycle.accelerate(speed1));

        int speed2 = 45;
        assertEquals(0, bicycle.accelerate(speed2));
    }

}
