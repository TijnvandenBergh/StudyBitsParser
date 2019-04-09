package nl.quintor.studybits.business;

import lombok.Getter;
import lombok.Setter;
import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;

import java.util.List;

@Getter
@Setter
public class ProgressService extends Service {

    public ProgressService(String name, String url, List<String> endpointList) {
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
