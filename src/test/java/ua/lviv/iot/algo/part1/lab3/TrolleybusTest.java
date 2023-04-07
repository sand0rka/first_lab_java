package ua.lviv.iot.algo.part1.lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrolleybusTest {
    Trolleybus trolleybus = new Trolleybus();
    Trolleybus trolleybus1 = new Trolleybus(122, 65, 22, "Sknylivok", 50, 34);

    @Test
    public void testRouteNumber() {
        assertEquals(22, trolleybus1.getRouteNumber());
    }

    @Test
    public void testCurrentStop() {
        assertEquals("Sknylivok", trolleybus1.getCurrentStop());
    }

    @Test
    public void testStart() {
        int expectedSpeed = 20;
        int currentSpeed = trolleybus.start();
        assertEquals(expectedSpeed, currentSpeed);
    }

    @Test
    public void testCapacity() {
        assertEquals(50, trolleybus1.getCapacity());
    }


    @Test
    public void testStop() {
        int result = trolleybus.stop();
        assertEquals(0, result);
    }

    @Test
    public void testAddPassenger() {
        trolleybus.setPassengers(5);
        trolleybus.setCapacity(40);
        int initialPassengers = trolleybus.getPassengers();
        assertEquals(initialPassengers + 1, trolleybus.addPassenger());

        trolleybus.setPassengers(40);
        assertEquals(0, trolleybus.addPassenger());
    }

    @Test
    public void testRemovePassenger() {
        trolleybus.setPassengers(5);
        int initialPassengers = trolleybus.getPassengers();
        trolleybus.removePassenger();
        assertEquals(initialPassengers - 1, trolleybus.getPassengers());
    }

    @Test
    public void testAccelerate() {
        trolleybus.setMaxSpeed(60);
        int speed1 = 40;
        assertEquals(speed1, trolleybus.accelerate(speed1));

        int speed2 = 90;
        assertEquals(0, trolleybus.accelerate(speed2));
    }

}
