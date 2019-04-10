package nl.quintor.studybits.business;

import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;

import java.util.List;

public class OsirisService extends Service {

    public OsirisService(String name, String url, List<String> endpointList) {
        super(name, url);
    }


    public String callApi(String url) {
        return null;
    }

    @Override
    public String callApi() {
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
