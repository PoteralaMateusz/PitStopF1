package pl.pitstopf1.model.season;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class RaceTable {

    private String season;
    @JsonProperty("Races")
    private List<Race> races = new ArrayList<>();
}
