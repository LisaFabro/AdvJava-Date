import java.time.OffsetDateTime;

public class Date_5 {
    //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    //Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
    //verificare che la prima data è precedente alla seconda
    //verificare che la seconda data è successiva alla prima
    //verificare che le due date sono uguali ad ora
    //Stampa il risultato
    public static void main(String[] args) {
        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        System.out.println("La data 1 è precedente alla data 2? " + date1.isBefore(date2));
        System.out.println("La data 2 è successiva alla data1? " + date2.isAfter(date1));
        System.out.println("Le due date sono uguali? " + date1.isEqual(date2));
    }
}
