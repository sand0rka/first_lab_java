package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TransportWriterTest {
    private static final String EXPECTED_FILENAME =  "expected.csv";
    private static final String RESULT_FILENAME = "result.csv";

    private TransportWriter transportWriter;
    private List<AbstractTransport> transports;
    private File actualFile;

    @BeforeEach
    void setUp() throws IOException{
        transportWriter = new TransportWriter();
        transports = new LinkedList<>();
        transports.add(new Trolleybus(122, 65, 22, "Sknylivok", 50, 34));
        transports.add(new Trolleybus(564, 60, 38, "Kulparkiv", 60, 6));
        transports.add(new Car(2414, 200, 4, 300, 11));
        transports.add(new Car(5680, 250, 2, 450, 22));
        transports.add(new Tram(1178, 80, 1, 200));
        transports.add(new Tram(1166, 70, 4, 154));
        transports.add(new Bicycle(247, 40, "Kellys"));
        transports.add(new Bicycle(578, 50, "Merida"));
        actualFile = new File(RESULT_FILENAME);
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    void testWriteToFileWithEmptyList() throws IOException {
        transports = new LinkedList<>();

        transportWriter.writeToFile(transports);

        assertTrue(actualFile.exists());
    }

    @Test
    public void testWriteListOfTransport() throws IOException {
        transportWriter.writeToFile(transports);
        Path expected = new File(RESULT_FILENAME).toPath();
        Path actual = new File(EXPECTED_FILENAME).toPath();
        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));

    }

    @Test
    public void testFileOverride() throws IOException {
        FileWriter writeSasha = new FileWriter(RESULT_FILENAME);
        writeSasha.write("Sasha");
        writeSasha.close();
        testWriteListOfTransport();
    }
}
