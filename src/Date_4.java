import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date_4 {
    //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    //aggiungi un anno
    //sottrai un mese
    //aggiungi 7 giorni
    //Stampa il risultato localizzata per l'Italia
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String datePrintable = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data iniziale: " + datePrintable);


        OffsetDateTime yearLater = date.plusYears(1);
        String yearLaterPrintable = yearLater.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Aggiunta di un anno: " + yearLaterPrintable);

        OffsetDateTime monthLater = date.minusMonths(1);
        String monthLaterPrintable = monthLater.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Sottrazione di un mese: " + monthLaterPrintable);

        OffsetDateTime weekLater = date.plusDays(7);
        String weekLaterPrintable = weekLater.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Aggiunta di una settimana: " + weekLaterPrintable);
    }
}
