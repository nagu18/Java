import java.math.BigDecimal;
public class Bigdecimal2 {
    public static void main(String[] args)
    {
        BigDecimal bd1 = new BigDecimal("124567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.123456789");
        //ADDING OF TWO NUMBERS BIGDECIMAL
        
        BigDecimal sum = bd1.add(bd2);
        System.out.println("sum = " + sum);
        //multiply:
        BigDecimal mul = bd1.multiply(bd2);
        System.out.println("mul = " + mul);
        //subtract:
        BigDecimal sub = bd1.subtract(bd2);
        System.out.println("sub = " + sub);

    }
}
