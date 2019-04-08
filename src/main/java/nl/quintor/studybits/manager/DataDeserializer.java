package nl.quintor.studybits.manager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.quintor.studybits.business.IServiceCall;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DataDeserializer {
    private static DataDeserializer uniqInstance;
    private List<IServiceCall> dataAdapterList = new ArrayList<IServiceCall>();

    private DataDeserializer(){}


    public void registerParser(IServiceCall call) {
        dataAdapterList.add(call);
    }

    public static DataDeserializer getInstance(){
        if (uniqInstance == null ) {
            uniqInstance = new DataDeserializer();
        }
        return uniqInstance;
    }
}
