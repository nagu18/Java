import java.time.LocalDate;

public class PluseYear {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2019, 8, 10);
        System.out.println("Current date: " + currentDate);

        LocalDate newDate = currentDate.plusYears(10);
        System.out.println("New date: " + newDate);
    }
}
