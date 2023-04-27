package ua.lviv.iot.algo.part1.lab3;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.Getter;

@Getter
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

    public static void main(final String[] args) throws IOException {

        List<AbstractTransport> transportManager = new LinkedList<>();
        transportManager.add(new Trolleybus(122, 65, 22, "Sknylivok", 50, 34));
        transportManager.add(new Car(2414, 200, 4, 300, 11));
        transportManager.add(new Tram(1178, 80, 1, 200));
        transportManager.add(new Car(5680, 250, 2, 450, 22));
        transportManager.add(new Tram(1166, 70, 4, 154));
        transportManager.add(new Bicycle(247, 40, "Kellys"));
        transportManager.add(new Bicycle(578, 50, "Merida"));
        transportManager.add(new Trolleybus(564, 60, 38, "Kulparkiv", 60, 6));


        TransportWriter writer = new TransportWriter();
        writer.writeToFile(transportManager);

    }

}
