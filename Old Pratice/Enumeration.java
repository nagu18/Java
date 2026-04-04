import java.util.Scanner;
import java.util.*;

public class Enumeration {
    enum Day{
        MON,TUE,WED,THRU,FRI,SAT,SUN;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        for(Day day : Day.values()){
            System.out.println(day);
        }
        System.out.println("ENTER INPUT");
        String ss = s.nextLine();
        Day m = Day.valueOf(ss);
        System.out.println(m.ordinal());
        switch ((m)) {
            case MON:
                System.out.println("TODAY IS MONDAY");
                break;
            case TUE:
            System.out.println("TODAY IS TURSDAY");
            break;
            case WED:
            System.out.println("TODAY IS WEDNESDAY");
            break;
            default:
            System.out.println("INVALID INPUT");
                break;
        }
    }
}

