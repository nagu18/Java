import java.time.LocalDate;
public class plusYears1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019,8,10);
        System.out.println(localDate);
        localDate = localDate.plusYears(10);
        System.out.println("New date : " + localDate);
    }

}
