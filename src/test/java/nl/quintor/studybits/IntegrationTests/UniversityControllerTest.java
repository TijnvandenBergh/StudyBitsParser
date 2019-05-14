package nl.quintor.studybits.IntegrationTests;

import nl.quintor.studybits.controller.UniversityController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UniversityControllerTest {

    @Autowired
    private UniversityController universityController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(this.universityController).build();
    }

    @Test
    public void testReturnAllUniversities() throws Exception {
        String url = "/university/universities";
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[0].universityName").exists()).andReturn();

        Assert.assertEquals(200, mvcResult.getResponse().getStatus());
    }

    @Test
    public void testReturnAllUniversitiesWrongUrl() throws Exception {
        String url = "/university";
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                ).andExpect(MockMvcResultMatchers.status().is4xxClientError())
                .andReturn();

        Assert.assertEquals(404, mvcResult.getResponse().getStatus());
    }




}
