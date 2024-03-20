public class AA {

    void fun() {
        System.out.println("Hello ravan");

        // Create a BA object within fun() to access its methods
        BA objBA = new BA();
        objBA.fun1();
    }

    class BA {
        void fun1() {
            System.out.println("hello nitish");

            // Create a CA object within fun1()
            CA objCA = new CA();
            objCA.fun2();
        }
    }

    class CA {
        void fun2() {
            System.out.println("Hello mukesh");
        }
    }

    public static void main(String[] args) {
        AA obj = new AA();
        obj.fun(); // Call fun() to start execution
    }
}
