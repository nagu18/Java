public class Outer {
    int data = 30;
    class Inner{
        void msg(){
            System.out.println("data is data " + data);}
        }
        public static void main(String[] args) {
            Outer obj = new Outer();
            Outer.Inner in = obj.new Inner();
            in.msg();
        }
    },

