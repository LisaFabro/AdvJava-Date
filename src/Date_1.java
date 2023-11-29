import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date_1 {
    //Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
    //Formatta la data ottenuta in FULL, MEDIUM e SHORT
    //Stampa le varie versioni
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        ZonedDateTime dateBis = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String dateBisFull = dateBis.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String dateFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateMedium = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String dateShort = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        System.out.println("Full date with time:" + dateBisFull);
        System.out.println("Full date without time:" + dateFull);
        System.out.println("Medium date with time:" + dateMedium);
        System.out.println("Short date with time:" + dateShort);
    }
}