class A extends Thread {
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Ankush");
        }
    }

}
/**
 * Thread
 */
class Bc {
    public static void main(String[] args) {
        A t = new A();
        t.start();
        for(int i = 0; i<=5; i++){
            System.out.println("Ankit");
        }
    }
}