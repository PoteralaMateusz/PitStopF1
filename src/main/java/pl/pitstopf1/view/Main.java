package pl.pitstopf1.view;

import pl.pitstopf1.api.SeasonData;
import pl.pitstopf1.model.season.RaceTable;

public class Main {

    public static void main(String[] args) {

        SeasonData seasonData = new SeasonData("2023");

        RaceTable raceTable2023 = seasonData.getRaceTable();

        raceTable2023.getRaces().forEach(race -> {
            System.out.println("Wyścig numer: " + race.getRound() + ", " + race.getRaceName() + " ->  data: " +
                    race.getDate() + " o godzinie " + race.getTime());
        });

    }
}
