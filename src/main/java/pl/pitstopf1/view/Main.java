package pl.pitstopf1.view;

import pl.pitstopf1.api.SeasonData;
import pl.pitstopf1.model.DateConverter;
import pl.pitstopf1.model.season.Race;
import pl.pitstopf1.model.season.RaceTable;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        SeasonData seasonData = new SeasonData("2023");

        RaceTable raceTable2023 = seasonData.getRaceTable();
        DateConverter.zone = "Europe/Warsaw";
        raceTable2023.getRaces().forEach(race -> {
            System.out.println("Wyścig numer: " + race.getRound() + ", " + race.getRaceName() + " ->  start: " +
                    race.getConvertDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));
        });

        Race closestRace = raceTable2023.getRaces().stream()
                .filter(race -> race.getConvertDate().isAfter(ZonedDateTime.now()))
                .min(Comparator.comparing(race -> Math.abs(Duration.between(race.getConvertDate(),ZonedDateTime.now()).toMinutes())))
                .orElse(null);

        System.out.println("Najbliższy wyścig: " + closestRace.getRaceName() + " ->  start: " +
                closestRace.getConvertDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));


    }
}
