import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(623);
        numbers.add(-29);
        numbers.add(68);
        numbers.add(0);
        numbers.add(4);
        SortingNums.sortAscending(numbers);
        System.out.println("Список за зростанням: " + numbers);
        SortingNums.sortDescending(numbers);
        System.out.println("Список за спаданням: " + numbers);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("12");
        strings.add("12");
        strings.add("542");
        strings.add("732");
        strings.add("-17");
        strings.add("-56");
        strings.add("-56");
        strings.add("985");
        RemovingDuplicates.removeDuplicates(strings);
        System.out.println("Список без дублікатів: " + strings);

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(-74);
        numbers1.add(853);
        numbers1.add(896);
        numbers1.add(213);
        numbers1.add(17);
        numbers1.add(86);
        int minValue = MinMaxNum.findMinValue(numbers);
        int maxValue = MinMaxNum.findMaxValue(numbers);
        System.out.println("Найменше число: " + minValue);
        System.out.println("Найбільше число: " + maxValue);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(562);
        list1.add(-85);
        list1.add(24);
        list1.add(24);
        list1.add(-9);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(562);
        list2.add(13);
        list2.add(483);
        list2.add(98);
        list2.add(24);
        list2.add(5);
        list2.add(0);
        ArrayList<Integer> mergedList = MergeWithoutDuplicates.mergeLists(list1, list2);
        System.out.println("Об'єднаний список без дублікатів: " + mergedList);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(145);
        numbers2.add(65);
        numbers2.add(841);
        numbers2.add(-45);
        numbers2.add(5);
        numbers2.add(-8);
        int searchNumber1 = 5;
        int searchNumber2 = -9;
        NumberSearch.checkElement(numbers2, searchNumber1);
        NumberSearch.checkElement(numbers2, searchNumber2);
        }
    }