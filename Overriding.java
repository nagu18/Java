class Demo{
    void draw(){
        System.out.println("can't say shape");
    }
}
class Square extends Demo{
    void koma(){
        System.out.println("Square Shape");
    }
}
class Overriding{
    public static void main(String[] args){
       Demo r = new Square();
        r.draw();
    }
}
