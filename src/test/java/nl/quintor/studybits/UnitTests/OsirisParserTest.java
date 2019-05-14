package nl.quintor.studybits.UnitTests;

import nl.quintor.studybits.business.OsirisParser;
import nl.quintor.studybits.business.ProgressParser;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.util.Assert;


public class OsirisParserTest {

    @Test
    public void splitFirstNameCorrectly() {
        OsirisParser osirisParser = new OsirisParser();
        String firstName = osirisParser.splitFirstName("Tijn van den Bergh");
        assertEquals("Tijn", firstName);
    }

    @Test
    public void splitFirstNameWithDash() {
        OsirisParser osirisParser = new OsirisParser();
        String firstName = osirisParser.splitFirstName("Gert-jan van den Bergh");
        System.out.println(firstName);
        assertEquals("Gert-jan", firstName);
    }
}
