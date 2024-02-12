class Reference {
    int id;
    String name;

}
public class Student{
    public static void main(String[] args) {
        Reference t1 = new Reference();
        t1.id=101;
        t1.name="Sonoo";
        System.out.println(t1.id+" "+t1.name); 
    }

}