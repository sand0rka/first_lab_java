package ua.lviv.iot.algo.part1.lab3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransportManager {
    private List<AbstractTransport> transports = new LinkedList<>();

    public final void addTransport(final AbstractTransport transport) {
        this.transports.add(transport);
    }

    public final List<AbstractTransport>
    findTransportWithMaxSpeedHigherThan(final int maxSpeed) {
        Stream<AbstractTransport> abstractTransportStream = transports.stream().
                filter(transport -> transport.
                        getMaxSpeed() > maxSpeed);
        return abstractTransportStream.
                collect(Collectors.toList());
    }

    public final List<AbstractTransport> findTransportById(final int id) {
        return transports.stream().
                filter(transport -> transport.
                        getId() == id).
                collect(Collectors.toList());
    }

}
