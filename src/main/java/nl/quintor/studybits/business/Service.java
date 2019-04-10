package nl.quintor.studybits.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;

@NoArgsConstructor
@Getter
@Setter
public abstract class Service {
    private String name;
    private String url;

    public Service(String name, String url) {
        this.name = name;
        this.url = url;
    }
    public abstract String callApi();
    public abstract Student parseStudent(int id);
    public abstract Transcript parseTranscript();
    public abstract ExchangePosition parseExchangePosition();
}
