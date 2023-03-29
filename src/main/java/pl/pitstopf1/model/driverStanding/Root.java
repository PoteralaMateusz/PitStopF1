package pl.pitstopf1.model.driverStanding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Root {
    @JsonProperty("MRData")
    private MRData mRData;
}
