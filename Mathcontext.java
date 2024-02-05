import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
public class Mathcontext {
    public static void main(String[] args){
        //creating a mathcontext with precsion 4 and rounding mode Half_up
        MathContext m1 = new MathContext(4,RoundingMode.HALF_UP);
        //creating bigdecimal:
        BigDecimal num1 = new BigDecimal("123.456734982940829481834198408302481208482430183489",m1);
        BigDecimal num2 = new BigDecimal("143.999946647373747473773388283847478399",m1);
        //preforming sum :
        BigDecimal result = num1.add(num2,m1);
        //displaying:
        System.out.println("Result = " + result);
        

    }
}