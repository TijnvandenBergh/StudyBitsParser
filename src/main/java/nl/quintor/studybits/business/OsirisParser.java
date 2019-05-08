package nl.quintor.studybits.business;

import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;

public class OsirisParser extends Parser {

    public OsirisParser(String name, String url) {
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
