package ua.lviv.iot.algo.part1.lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TramTest {
    Tram tram = new Tram();
    Tram tram1 = new Tram(1178, 80, 1, 200);

    @Test
    public void testRouteNumber() {
        assertEquals(1, tram1.getRouteNumber());
    }

    @Test
    public void testCapacity() {

        assertEquals(200, tram1.getCapacity());
    }


    @Test
    public void testAccelerate() {
        tram.setMaxSpeed(80);
        int speed1 = 50;
        assertEquals(speed1, tram.accelerate(speed1));

        int speed2 = 90;
        assertEquals(0, tram.accelerate(speed2));
    }
}
