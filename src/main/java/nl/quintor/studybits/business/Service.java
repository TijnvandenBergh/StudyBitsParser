package nl.quintor.studybits.business;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public abstract class Service {
    private String name;
    private String url;
    private List<String> endpointList;

    public Service(String name, String url, List<String> endpointList) {
        this.name = name;
        this.url = url;
        this.endpointList = endpointList;
    }

    public abstract Student parseStudent(String data);
    public abstract Transcript parseTranscript(String data);
    public abstract ExchangePosition parseExchangePosition(String data);
}
