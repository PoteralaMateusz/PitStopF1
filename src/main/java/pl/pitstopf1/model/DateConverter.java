package pl.pitstopf1.model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateConverter {

    private static String dateTimeString;
    private static ZonedDateTime dateTime;
    public static String zone;

    public DateConverter() {
        zone = "Europe/Warsaw";
    }

    public static ZonedDateTime getDateTime(String date, String time) {
        dateTimeString = date + "T" + time;
        dateTime = ZonedDateTime.parse(dateTimeString,DateTimeFormatter.ISO_DATE_TIME);
        ZoneId zoneId = ZoneId.of(zone);
        dateTime = dateTime.withZoneSameInstant(zoneId);
        return dateTime;
    }
}
