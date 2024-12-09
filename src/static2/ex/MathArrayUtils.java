package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils() {
        //Block create instance
    }

    public static int sum(int[] values){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum/values.length;

    }

    public static int min(int[] values){
        Arrays.sort(values);
        return values[0];
    }

    public static int max(int[] values){
        Arrays.sort(values);
        return values[values.length-1];
    }
}
