import java.util.*;

class AreaRectangle {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    int b = scanner.nextInt();

    void p() {
        int perimeter = 2 * (l + b);
        System.out.println("the parameter : "+ perimeter);
    }

    void a() {
        int area = l * b;
        System.out.println("the area :" + area);
    }

    public static void main(String[] args) {
        AreaRectangle obj = new AreaRectangle();
        obj.p();
        obj.a();
    }
}
