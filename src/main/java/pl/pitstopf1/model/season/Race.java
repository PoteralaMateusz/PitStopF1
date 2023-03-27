package pl.pitstopf1.model.season;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Race {

    private String season;
    private String round;
    private String url;
    private String raceName;
    @JsonProperty("Circuit")
    private Circuit circuit;
    private String date;
    private String time;
    @JsonProperty("FirstPractice")
    private FirstPractice firstPractice;
    @JsonProperty("SecondPractice")
    private SecondPractice secondPractice;
    @JsonProperty("ThirdPractice")
    private ThirdPractice thirdPractice;
    @JsonProperty("Qualifying")
    private Qualifying qualifying;
    @JsonProperty("Sprint")
    private Sprint sprint;

}
