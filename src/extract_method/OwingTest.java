package extract_method;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class OwingTest {
    Owing owing;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        owing = new Owing("o1");
        owing._orders.add(new Order(10));
        owing._orders.add(new Order(20));
        owing._orders.add(new Order(30));
        owing._orders.add(new Order(50));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void printOwing() {
        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
// IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
// Tell Java to use your special stream
        System.setOut(ps);
// Print some output: goes to your special stream
        owing.printOwing();
// Put things back
        System.out.flush();
        System.setOut(old);

        assertEquals("**************************\n" +
                        "***** Customer Owes ******\n" +
                        "**************************\n" +
                        "name:o1\n" +
                        "amount110.0\n",
                baos.toString().replaceAll("\\r\\n?", "\n")
                , "printOwing message fails"
        );
    }
}