package pl.pitstopf1.model.constructorStandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.pitstopf1.model.driverStandings.Constructor;
@Setter
@Getter
@ToString
public class ConstructorStanding {

    private String position;
    private String positionText;
    private String points;
    private String wins;
    @JsonProperty("Constructor")
    private Constructor constructor;
}
