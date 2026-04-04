import java.time.*;
import java.util.*;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        LocalDate d1 = LocalDate.parse(str1);
        System.out.println(d1.isLeapYear());
    }
    
}
