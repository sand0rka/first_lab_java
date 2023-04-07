package ua.lviv.iot.algo.part1.lab3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TransportManager {
    final List<AbstractTransport> transports = new LinkedList<>();

    public void addTransport(AbstractTransport transport) {
        this.transports.add(transport);
    }

    public List<AbstractTransport> findTransportWithMaxSpeedHigherThan(int maxSpeed) {
        Stream<AbstractTransport> abstractTransportStream = transports.stream().
                filter(transport -> transport.
                        getMaxSpeed() > maxSpeed);
        return abstractTransportStream.
                collect(Collectors.toList());
    }

    public List<AbstractTransport> findTransportById(int id) {
        return transports.stream().
                filter(transport -> transport.
                        getId() == id).
                collect(Collectors.toList());
    }

}
