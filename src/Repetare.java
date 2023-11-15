public class Repetare {

    //       LocalDate -> Anul, luna, ziua
//       LocalTime -> ore, minute, secunde, nanosecunde
//       LocalDateTime -> Anul, luna, ziua, ore, minute, secunde, nanosecunde
//       ZoneDateTime -> Anul, luna, ziua, ore, minute, secunde, ZoneId("Chisinau")

// Metoda de creare:
    //  LocalDate.of(), LocalTime.of(), LocalDateTime.of(), ZoneDateTime.of()  -> cream data sau timpul in trecut/viitor
    //  LocalDate.now(), LocalTime.now(), LocalDateTime.now(), ZoneDateTime.now()  -> prezentul

// Modificare:
    // LocalDate.plusDays(), LocalDate.minusDays(),
    // LocalDate localDate = LocalDate.now()
    // localDate = localDate.plusDays(1);

// Compararea:
    //  LocalDate localDate = LocalDate.of(2023, 11, 15);
    //  LocalDate localDate2 = LocalDate.of(2023, 11, 14);
    //  if(localDate2.isBefore(localDate))  -> true
    //  if(localDate2.isAfter(localDate))  -> false
}
