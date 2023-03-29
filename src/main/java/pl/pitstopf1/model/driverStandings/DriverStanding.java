package pl.pitstopf1.model.driverStandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
@Setter
@Getter
@ToString
public class DriverStanding {

    private String position;
    private String positionText;
    private String points;
    private String wins;
    @JsonProperty("Driver")
    private Driver driver;
    @JsonProperty("Constructors")
    private ArrayList<Constructor> constructors;
}
