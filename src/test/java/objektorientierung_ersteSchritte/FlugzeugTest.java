package objektorientierung_ersteSchritte;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlugzeugTest {

    @Test
    public void testFliegen() {
        Flugzeug flugzeug = new Flugzeug(150, "Boeing", "New York", "Berlin");
        assertEquals("Berlin", flugzeug.getAusgangsLand());
        assertEquals("New York", flugzeug.getReiseZiel());

        flugzeug.fliegen();
        assertEquals("New York", flugzeug.getAusgangsLand());
        assertEquals("Berlin", flugzeug.getReiseZiel());
    }

    @Test
    public void testBerechneFlugzeit() {
        Flugzeug flugzeug = new Flugzeug(150, "Boeing", "New York", "Berlin");
        flugzeug.berechneFlugzeit();
        assertTrue(flugzeug.getFlugzeit() > 0);
        assertTrue(flugzeug.getFlugzeit() < 1000);
    }

}
