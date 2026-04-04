public class Contractor {
    void add(int... a)
    {
        int sum = 0;
        for(int x:a)
    
        sum = sum+x;
    System.out.println("sum of number "+sum);
    }
     static class Demo
    {
        public static void main(String[] args)
        {
            Contractor r = new Contractor(); 
            r.add();
            r.add(10);
            r.add(10,20);
        }
    }

}
