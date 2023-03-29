package pl.pitstopf1.model.driverStanding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
@Setter
@Getter
@ToString
public class StandingsTable {

    private String season;
    @JsonProperty("StandingsLists")
    private ArrayList<StandingsList> standingsLists;

}

