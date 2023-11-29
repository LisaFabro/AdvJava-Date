import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Date_3 {
    //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    //ottieni l'anno
    //ottieni il mese
    //ottieni il giorno
    //ottieni il giorno della settimana
    //Stampa i risultati sulla console
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String year = date.format(DateTimeFormatter.ofPattern("yyyy"));
        String month = date.format(DateTimeFormatter.ofPattern("MMMM"));
        String day = date.format(DateTimeFormatter.ofPattern("dd"));
        String dayOfWeek = date.format(DateTimeFormatter.ofPattern("EEEE"));

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);
    }
}
