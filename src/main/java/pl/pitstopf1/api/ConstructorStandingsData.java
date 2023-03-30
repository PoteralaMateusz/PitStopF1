package pl.pitstopf1.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pitstopf1.model.constructorStandings.ConstructorStanding;
import pl.pitstopf1.model.constructorStandings.Root;

import java.util.ArrayList;

public class ConstructorStandingsData {

    private String season;
    private Formula1API apiJson;
    private Root constructorStandingsData;

    public ConstructorStandingsData(String season) {
        this.season = season;
        this.apiJson = new Formula1API("https://ergast.com/api/f1/" + this.season + "/constructorStandings.json");
        getConstructorStandingsDataFromJson();
    }

    public ArrayList<ConstructorStanding> getConstructorStandingsData() {
        return constructorStandingsData.getMRData().getStandingsTable().getStandingsLists().get(0).getConstructorStandings();
    }

    private void getConstructorStandingsDataFromJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            constructorStandingsData = mapper.readValue(apiJson.getApiJson().toString(), Root.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
