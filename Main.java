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

    public static List<Double> getRollingAverage(List<Integer> arr, int k) {
        List<Double> resultList = new ArrayList<>();
        if (arr == null || arr.isEmpty() || k <= 0 || k > arr.size()) {
            return resultList;
        }

        int currentSum = 0;
        

        for (int i = 0; i < k; i++) {
            currentSum += arr.get(i);
        }
        resultList.add((double) currentSum / k);

        for (int i = k; i < arr.size(); i++) {
            currentSum = currentSum - arr.get(i - k) + arr.get(i);
            resultList.add((double) currentSum / k);
        }

        return resultList;
    }
}
