package ua.lviv.iot.algo.part1.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TransportManagerTest {
    TransportManager transportManager = new TransportManager();

    @Test
    public void testAddTransport() {
        transportManager.addTransport(new Trolleybus(122, 65, 22, "Sknylivok", 50, 34));
        transportManager.addTransport(new Car(2414, 200, 4, 300, 11));
        transportManager.addTransport(new Tram(1178, 80, 1, 200));
        transportManager.addTransport(new Bicycle(247, 40, "Kellys"));

        int initialSize = transportManager.getTransports().size();
        transportManager.addTransport(new Car(1234, 150, 4, 250, 18));
        Assertions.assertEquals(initialSize + 1, transportManager.getTransports().size());
    }


    @Test
    public void testFindTransportWithMaxSpeedHigherThan() {
        transportManager.addTransport(new Trolleybus(122, 65, 22, "Sknylivok", 50, 34));
        transportManager.addTransport(new Car(2414, 200, 4, 300, 11));
        transportManager.addTransport(new Car(5680, 250, 2, 450, 22));
        transportManager.addTransport(new Tram(1178, 80, 1, 200));
        transportManager.addTransport(new Tram(1166, 70, 4, 154));
        transportManager.addTransport(new Bicycle(578, 50, "Merida"));

        List<AbstractTransport> fastTransports = transportManager.findTransportWithMaxSpeedHigherThan(70);
        Assertions.assertEquals(3, fastTransports.size());
    }

    @Test
    public void testFindTransportById() {
        transportManager.addTransport(new Trolleybus(122, 65, 22, "Sknylivok", 50, 34));
        transportManager.addTransport(new Car(5680, 250, 2, 450, 22));
        transportManager.addTransport(new Tram(1166, 70, 4, 154));
        transportManager.addTransport(new Bicycle(247, 40, "Kellys"));

        List<AbstractTransport> actualTransport = new LinkedList<>();
        actualTransport.add(new Trolleybus(122, 65, 22, "Sknylivok", 50, 34));

        assertEquals(actualTransport.size(), transportManager.findTransportById(122).size());
    }
}
