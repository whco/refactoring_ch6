package extract_method;

import static org.junit.jupiter.api.Assertions.*;

class OwingTest {
    Owing owing;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        owing = new Owing("o1");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

//    @org.junit.jupiter.api.Test
//    void printOwing() {
//        owing._orders.add(new Order(10));
//        owing._orders.add(new Order(20));
//        owing._orders.add(new Order(30));
//        owing._orders.add(new Order(50));
//        assertEquals("**************************\n"
//                + "***** Customer Owes ******\n"
//                + "**************************\n"
//                + "name:" + "o1\n"
//                + "amount" + 110,
//                );
//    }
}