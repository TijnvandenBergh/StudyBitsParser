package nl.quintor.studybits.manager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.quintor.studybits.business.IServiceCall;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataDeserializer {
    public List<IServiceCall> dataAdapterList;

    public void registerParser(IServiceCall call) {
        dataAdapterList.add(call);
    }
}
