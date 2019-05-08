package nl.quintor.studybits.UnitTests;

import nl.quintor.studybits.business.ProgressParser;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.util.Assert;


public class ProgressParserTest {

    @Test
    public void splitFirstNameCorrectly() {
        ProgressParser progressParser = new ProgressParser();
        String firstName = progressParser.splitFirstName("Tijn van den Bergh");
        assertEquals("Tijn", firstName);
    }

    @Test
    public void splitFirstNameWithDash() {
        ProgressParser progressParser = new ProgressParser();
        String firstName = progressParser.splitFirstName("Gert-jan van den Bergh");
        System.out.println(firstName);
        assertEquals("Gert-jan", firstName);
    }
}
