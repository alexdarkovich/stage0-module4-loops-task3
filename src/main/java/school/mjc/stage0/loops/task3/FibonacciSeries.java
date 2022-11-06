package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f = 0;
        int a = 0;
         int b = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(f);
            a = b;
            b = f;
            f = a + b;
        }
    }
}
