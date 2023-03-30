package pl.pitstopf1.model.constructorStandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
@Setter
@Getter
@ToString
public class StandingsList {

    private String season;
    private String round;
    @JsonProperty("ConstructorStandings")
    private ArrayList<ConstructorStanding> constructorStandings;
}
