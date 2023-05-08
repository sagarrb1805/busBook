import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class BusBookTest {

    Bus bus = new Bus();

    
    void testBus(){
        bus.selectBus();
        assertEquals("Bus 1", bus.selectedBus);
    }


    public static void main(String[] args) {
        BusBookTest testB = new BusBookTest();
        testB.testBus();
    }
    
}
