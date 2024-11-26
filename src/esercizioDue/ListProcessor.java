package esercizioDue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListProcessor {
    public static List<Integer>  generateRandomList(int n) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(101));
        }
        Collections.sort(list);
        return list;
    }

    public static List<Integer> mirroredList(List<Integer> list) {
        List<Integer> mirroredList = new ArrayList<>(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            mirroredList.add(list.get(i));
        }
        return mirroredList;
    }

    public static void printByPosition(List<Integer> list, boolean printEven) {
        for (int i = 0; i < list.size(); i++) {
            if ((printEven && i % 2 == 0) || (!printEven && i % 2 != 0)) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = generateRandomList(10);
        System.out.println("Original list: " + list);

        List<Integer> mirroredList = mirroredList(list);
        System.out.println("Reversed mirrored list: " + mirroredList);

        System.out.println("Even positions:");
        printByPosition(list, true);

        System.out.println("Odd positions:");
        printByPosition(list, false);
    }
}
