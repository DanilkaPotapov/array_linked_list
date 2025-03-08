import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);

        System.out.println(getRollingAverage(arr, 2));
    }

    public static List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
        List<Double> resultList = new ArrayList<>();
        int cur = 0;

        for (int i = 0; i < k; i++) {
            cur += arr.get(i);
        }

        resultList.add((double) cur / k);

        int start = 0;
        int end = k;

        int iterations  = (arr.size() % 2 == 0) ? (arr.size() / k) : (arr.size() / k + 1);

        for (int i = 0; i < iterations; i++) {
            cur = cur - arr.get(start) + arr.get(end);
            resultList.add((double) cur / k);

            start++;
            end++;
        }

        return resultList;
    }
}