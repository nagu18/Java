class Run {
    int rollno;
    int marks;
    String name;
    void input(){
        System.out.println("Enter roll name & marks ");
    }
}
class Ra extends Run{
    void disp(){
        rollno = 1;
        name = "jack";
        marks = 90;
        System.out.println(rollno + " "+name+" "+marks);
    }
}
class Inheritance extends Ra{
    public static void main(String[] args){
        Ra r = new Ra();
        r.input();
        r.disp();
    }
}
