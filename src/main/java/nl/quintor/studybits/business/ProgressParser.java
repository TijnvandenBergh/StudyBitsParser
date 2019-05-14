package nl.quintor.studybits.business;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import java.io.IOException;


@Getter
@Setter
@NoArgsConstructor
public class ProgressParser extends Parser {
    protected static final Logger logger = LogManager.getLogger();

    private static final String URL_PROGRESS = "https://my-json-server.typicode.com/tijn167/FakeJsonApi";
    private static final String STUDENT_BY_ID_ENDPOINT = "/students/{id}";

    ApiCallService apiCallService = new ApiCallService();

    public ProgressParser(String name, String url) {
        super(name, url);
    }

    @Override
    public String callDataSource(int id, String url, String endpoint) {
        return null;
    }

    @Override
    public Student parseStudent(int id) {
        return null;
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
