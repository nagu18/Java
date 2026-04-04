public class Para {
    public static void main(String[] args) {
        B obj = new B(100,200);
        obj.show();
    }
    
}
class B{
    int x,y;
    B(int a,int b){
        x=a; y=b;

    }
    void show(){
        System.out.println(x+y);
    }
}