import java.util.ArrayList;
import java.util.HashMap;
public class MergeWithoutDuplicates {
    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashMap<Integer, Boolean> uniqueMap = new HashMap<>();
        ArrayList<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            Integer number = list1.get(i);
            if (uniqueMap.containsKey(number)) {
                continue;
            }

            mergedList.add(number);
            uniqueMap.put(number, true);
        }
        for (int i = 0; i < list2.size(); i++) {
            Integer number = list2.get(i);
            if (uniqueMap.containsKey(number)) {
                continue;
            }
            mergedList.add(number);
            uniqueMap.put(number, true);
        }
        return mergedList;
    }
}