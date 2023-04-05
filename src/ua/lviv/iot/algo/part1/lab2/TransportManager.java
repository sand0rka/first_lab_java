package ua.lviv.iot.algo.part1.lab2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TransportManager {
    private final List<AbstractTransport> transports = new LinkedList<>();
    public void addTransport(AbstractTransport transport) {
        this.transports.add(transport);
    }
    public List<AbstractTransport> findTransportWithMaxSpeedHigherThan(int maxSpeed) {
        return transports.stream().
                filter(transport -> transport.
                        getMaxSpeed() > maxSpeed).
                collect(Collectors.toList());
    }

    public List<AbstractTransport> findTransportById(int id) {
        return transports.stream().
                filter(transport -> transport.
                        getId() == id).
                collect(Collectors.toList());
    }

    public static void main(String[] args) {

        TransportManager transportManager = new TransportManager();
        transportManager.addTransport(new Trolleybus(122, 65, 22, "Sknylivok", 50, 34));
        transportManager.addTransport(new Trolleybus(564, 60, 38, "Kulparkiv", 60, 6));
        transportManager.addTransport(new Car(2414, 200, 4, 300, 11));
        transportManager.addTransport(new Car(5680, 250, 2, 450, 22));
        transportManager.addTransport(new Tram(1178, 80, 1, 200));
        transportManager.addTransport(new Tram(1166, 70, 4, 154));
        transportManager.addTransport(new Bicycle(247, 40, "Kellys"));
        transportManager.addTransport(new Bicycle(578, 50, "Merida"));

        for (AbstractTransport transport : transportManager.transports) {
            System.out.println(transport);
        }

        var transportWithMaxSpeedHigherThan = transportManager.findTransportWithMaxSpeedHigherThan(60);
        System.out.println("\nTransport with max speed higher than 60: ");
        for (AbstractTransport transport: transportWithMaxSpeedHigherThan){
            System.out.println(transport);
        }

        var transportWithId = transportManager.findTransportById(564);
        System.out.println("\nTransport with id 564: ");
        for (AbstractTransport transport: transportWithId){
            System.out.println(transport);
        }
    }
}
