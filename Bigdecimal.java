import java.math.BigDecimal;
class Bigdecimal{
    public static void main(String[] args){
        Double a = 1.5;
        Double b = 1.50;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
        System.out.println("--------------------------------------------------");
        BigDecimal x = new BigDecimal("1.5");
        BigDecimal y = new BigDecimal("1.50");
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.equals(y));
    }

}