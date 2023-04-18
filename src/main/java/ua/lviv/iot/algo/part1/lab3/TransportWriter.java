package ua.lviv.iot.algo.part1.lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportWriter {
    static final String DEFAULT_FILE_NAME = "result.csv";
    public final void writeToFile(final List<AbstractTransport> transports)
            throws IOException {
        FileWriter writer = new FileWriter(DEFAULT_FILE_NAME);
        Map<String, Boolean> headerMap = new HashMap<>();

        transports.sort(new Comparator<AbstractTransport>() {
            @Override
            public int compare(final AbstractTransport transport1, final AbstractTransport transport2) {
                return transport1.getClass().getSimpleName().compareTo(transport2.getClass().getSimpleName());
            }
        });

        for (AbstractTransport transport : transports) {
            if (!headerMap.containsKey(transport.getClass().getSimpleName())) {
                writer.write(transport.getHeaders() + "\n");
                headerMap.put(transport.getClass().getSimpleName(), true);
            }
            writer.write(transport.toCSV() + "\n");
        }

        writer.close();
    }
}
