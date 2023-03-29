package pl.pitstopf1.model.driverStanding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MRData {

    private String xmlns;
    private String series;
    private String url;
    private String limit;
    private String offset;
    private String total;
    @JsonProperty("StandingsTable")
    private StandingsTable standingsTable;

}
