package school.mjc.stage0.loops.task3;

import java.awt.dnd.DragSource;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) System.out.println(second);
        else {
            int gcd = 1;
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0){
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
    }
}
