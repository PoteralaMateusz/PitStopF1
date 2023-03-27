package pl.pitstopf1.model.season;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Circuit {

    private String circuitId;
    private String url;
    private String circuitName;
    @JsonProperty("Location")
    private Location location;
}
