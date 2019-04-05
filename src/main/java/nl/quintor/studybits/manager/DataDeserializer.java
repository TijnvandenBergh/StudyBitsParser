package nl.quintor.studybits.manager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.quintor.studybits.business.IServiceCall;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class DataDeserializer {
    private static DataDeserializer instance = new DataDeserializer();
    private DataDeserializer(){}
    private List<IServiceCall> dataAdapterList;

    public void registerParser(IServiceCall call) {
        dataAdapterList.add(call);
    }

    public static DataDeserializer getInstance(){
        return instance;
    }

}
