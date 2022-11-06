package school.mjc.stage0.loops.task3;

import java.util.Arrays;

public class NinesSum {
    public  void calculateSum(int lengthOfLastNumber) {

        if (lengthOfLastNumber < 0) {
            System.out.println(0);
        } else {
            int[] intArray = new int[lengthOfLastNumber];
            int num = 0;
            for (int i = 0; i < lengthOfLastNumber; i++) {
                num = num * 10 + 9;
                intArray[i] = num;
            }

            int sum = 0;
            for (int i : intArray) {
                sum += i;
            }

            System.out.println(sum);
        }

    }
}
