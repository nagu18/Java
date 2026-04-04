import java.time.LocalDate;
public class GetDateOfWeek {
    public static void main(String[] args){
        LocalDate dt = LocalDate.parse("2018-01-09");
        System.out.println(dt.getDayOfWeek());
    
}
}