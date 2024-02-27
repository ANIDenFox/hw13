import java.util.ArrayList;
import java.util.HashMap;

public class RemovingDuplicates {
    public static void removeDuplicates(ArrayList<String> list) {
        HashMap<String, Boolean> uniqueMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String currentString = list.get(i);
            if (uniqueMap.containsKey(currentString)) {
                list.remove(i);
                i--;
            } else {
                uniqueMap.put(currentString, true);
            }
        }
    }
}
