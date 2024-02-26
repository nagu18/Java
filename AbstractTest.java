abstract class Progaming {
    public abstract void learn();
}

class Html extends Progaming {
    @Override
    public void learn() {
        System.out.println("love html");
    }
}

class Java extends Progaming {
    @Override
    public void learn() {
        System.out.println("love java");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Html h = new Html();
        Java j = new Java();
        h.learn();
        j.learn();
    }
}
