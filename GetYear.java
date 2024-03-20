import java.time.LocalDate;
public class GetYear {
    public static void main(String[] args) {
        LocalDate loc = LocalDate.of(2020,5,13);
        System.out.println("Year: " + loc.getYear());
    }
}