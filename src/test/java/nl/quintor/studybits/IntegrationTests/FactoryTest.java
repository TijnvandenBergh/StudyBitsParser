package nl.quintor.studybits.IntegrationTests;

import nl.quintor.studybits.business.OsirisService;
import nl.quintor.studybits.business.ProgressService;
import nl.quintor.studybits.business.Service;
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
        Service serv = serviceCallFactory.getService("Osiris");
        assertThat(serv, instanceOf(OsirisService.class));
    }

    @Test
    public void testCreateProgressServiceSuccesFull()  {
        Service serv = serviceCallFactory.getService("Progress");
        assertThat(serv, instanceOf(ProgressService.class));
    }

    @Test
    public void testCreateProgressServiceUnSuccessFull() {
        Service serv = serviceCallFactory.getService("Progress");
        assertThat(serv, is(not(instanceOf(OsirisService.class))));
    }

    @Test
    public void testCreateWhenStringIsNotCorrect() {
        Service serv = serviceCallFactory.getService("0$iri$");
        assertThat(serv, is(nullValue()));
    }

    @Test
    public void testCreateWhenStringIsNull() {
        Service serv = serviceCallFactory.getService("");
        assertThat(serv,  is(nullValue()));
    }
}


