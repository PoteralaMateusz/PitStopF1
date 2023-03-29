package pl.pitstopf1.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pitstopf1.model.driverStandings.DriverStanding;
import pl.pitstopf1.model.driverStandings.Root;
import pl.pitstopf1.model.driverStandings.StandingsList;

import java.util.ArrayList;

public class DriverStandingsData {

    private String season;
    private Formula1API apiJson;
    private Root driverStandingsData;

    public DriverStandingsData(String season) {
        this.apiJson = new Formula1API(season);
        getDriverStandingsDataFromJson();
    }

    public ArrayList<DriverStanding> getDriverStandingsListData() {
        return driverStandingsData.getMRData().getStandingsTable().getStandingsLists().get(0).getDriverStandings();
    }

    private void getDriverStandingsDataFromJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            driverStandingsData = mapper.readValue(apiJson.getApiJson().toString(), Root.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
