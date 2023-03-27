package pl.pitstopf1.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pitstopf1.model.season.MRData;
import pl.pitstopf1.model.season.RaceTable;
import pl.pitstopf1.model.season.Root;

public class SeasonData {

    private String seasonYear;
    private Formula1API apiJson;
    private Root seasonData;

    public SeasonData(String seasonYear) {
        this.seasonYear = seasonYear;
        this.apiJson = new Formula1API("https://ergast.com/api/f1/" + this.seasonYear + ".json");
        getSeasonDataFromJson();
    }

    public RaceTable getRaceTable(){
        return seasonData.getMRData().getRaceTable();
    }

    private void getSeasonDataFromJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            seasonData = mapper.readValue(apiJson.getApiJson().toString(), Root.class);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
