public class Th {
    public static void main(String[] args) {
        int balance = 10000;
        balance = balance-10000;
        if(balance==0){
            throw new ArithmeticException("No Balance");
        }
    }
}
