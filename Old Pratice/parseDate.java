import java.time.LocalDate;
public class parseDate {
    public static void main(String[] args) {
        String str1 = "2011-09-01";
        LocalDate d1 = LocalDate.parse(str1);
        System.out.println("String to LocalDate: " + d1);

    }
}
