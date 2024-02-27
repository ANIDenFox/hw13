import java.util.ArrayList;

public class MinMaxNum {
    public static int findMinValue(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список порожній");
        }
        int minValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int number = list.get(i);
            if (number < minValue) {
                minValue = number;
            }
        }

        return minValue;
    }
    public static int findMaxValue(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список порожній");
        }
        int maxValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int number = list.get(i);
            if (number > maxValue) {
                maxValue = number;
            }
        }

        return maxValue;
    }
}
