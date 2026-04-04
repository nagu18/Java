public class Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a test.");
        sb.replace(5, 7, "was");
        System.out.println("Afer replace " + sb);
    }
}
