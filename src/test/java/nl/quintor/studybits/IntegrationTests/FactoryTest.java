package nl.quintor.studybits.IntegrationTests;

import nl.quintor.studybits.business.OsirisParser;
import nl.quintor.studybits.business.Parser;
import nl.quintor.studybits.business.ProgressParser;
import nl.quintor.studybits.manager.ServiceCallFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


@SpringBootTest
@RunWith(SpringRunner.class)
public class FactoryTest {

    @Autowired
    ServiceCallFactory serviceCallFactory;

    @Test
    public void testCreateOsirisServiceSuccesFull() {
        Parser serv = serviceCallFactory.getService("Osiris");
        assertThat(serv, instanceOf(OsirisParser.class));
    }

    @Test
    public void testCreateProgressServiceSuccesFull()  {
        Parser serv = serviceCallFactory.getService("Progress");
        assertThat(serv, instanceOf(ProgressParser.class));
    }

    @Test
    public void testCreateProgressServiceUnSuccessFull() {
        Parser serv = serviceCallFactory.getService("Progress");
        assertThat(serv, is(not(instanceOf(OsirisParser.class))));
    }

    @Test
    public void testCreateWhenStringIsNotCorrect() {
        Parser serv = serviceCallFactory.getService("0$iri$");
        assertThat(serv, is(nullValue()));
    }

    @Test
    public void testCreateWhenStringIsNull() {
        Parser serv = serviceCallFactory.getService("");
        assertThat(serv,  is(nullValue()));
    }
}


