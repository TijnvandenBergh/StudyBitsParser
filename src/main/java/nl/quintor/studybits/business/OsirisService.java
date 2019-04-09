package nl.quintor.studybits.business;

import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;

import java.util.List;

public class OsirisService extends Service {

    public OsirisService(String name, String url, List<String> endpointList) {
        super(name, url, endpointList);
    }
    @Override
    public Student parseStudent(String data) {
        return null;
    }

    @Override
    public Transcript parseTranscript(String data) {
        return null;
    }

    @Override
    public ExchangePosition parseExchangePosition(String data) {
        return null;
    }
}
