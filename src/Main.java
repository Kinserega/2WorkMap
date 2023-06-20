import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);
        System.out.println();
        printGrowNumber(nums);
        System.out.println();
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printUnique(strings);
        System.out.println();
        numberToDuplicates(strings);

    }

    public static void printOddNumbers(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                System.out.print(integer + " ");
            }
        }
    }

    public static void printGrowNumber(List<Integer> list) {
        Collections.sort(list);
        Set<Integer> set = new HashSet<>();
        for (Integer integer : list) {
            if (integer % 2 == 0 && !set.contains(integer)) {
                System.out.print(integer + " ");
            }
            set.add(integer);
        }
    }

    public static void printUnique(List<String> list) {
        Set<String> set = new HashSet<>(list);
        System.out.println(set.toString());
    }

    public static void numberToDuplicates(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, map.get(1));
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }
    }
}