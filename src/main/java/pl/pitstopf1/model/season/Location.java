package pl.pitstopf1.model.season;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Location {

    private String lat;
    @JsonProperty("long")
    private String myLong;
    private String locality;
    private String country;
}
