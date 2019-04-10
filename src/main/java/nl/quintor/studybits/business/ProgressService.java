package nl.quintor.studybits.business;


import lombok.Getter;
import lombok.Setter;
import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;


@Getter
@Setter
public class ProgressService extends Service {
    protected static final Logger logger = LogManager.getLogger();

    private static final String URL_PROGRESS = "https://my-json-server.typicode.com/tijn167/FakeJsonApi";
    private static final String STUDENT_BY_ID_ENDPOINT = "/students/{id}";

    ApiCallService apiCallService = new ApiCallService();

    public ProgressService(String name, String url) {
        super(name, url);
    }


    public String callApi(int id, String url, String endpoint) throws IOException {
        String data = apiCallService.callService(id, url, endpoint);
        logger.info(data);
        return "Ewa";
    }

    @Override
    public String callApi() {
        return null;
    }

    @Override
    public Student parseStudent(int id) {
        logger.info(id);
        try {
            callApi(id, URL_PROGRESS, STUDENT_BY_ID_ENDPOINT);
        } catch (IOException e) {
            logger.info(e.getMessage());
        }

        //Make student so app doesnt crash
        Student student = new Student();
        return student;
    }

    @Override
    public Transcript parseTranscript() {
        return null;
    }

    @Override
    public ExchangePosition parseExchangePosition() {
        return null;
    }

}
