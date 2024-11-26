package esercizioDue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListProcessor {
    //Primo metodo genera lista con elementi casuali
    public static List<Integer> generateRandomList(int n) {
        Random random = new Random();
        List<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(101));
        }
        return list;
    }

    //Secondo metodo genera lista con elementi in ordine inverso
    public static List<Integer> mirroredList(List<Integer> list) {
        List<Integer> mirroredList = new ArrayList<>(list);
        //Prendiamo gli elementi della lista in ordine inverso con un cilco for che parte dalla fine
        for (int i = list.size() - 1; i >= 0; i--) {
            mirroredList.add(list.get(i));
        }
        return mirroredList;
    }

    //Terzo metodo stampa elementi in posizione pari o dispari
    public static void printByPosition(List<Integer> list, boolean printEven) {
        for (int i = 0; i < list.size(); i++) {
            //Se printEven è true stampa elementi in posizione pari, altrimenti stampa elementi in posizione dispari nell'if
            //abbiamo utilizzato l'operatore modulo per controllare se i è pari o dispari e passato due paramtri con ||
            //se è true prende uno altrimenti l'altro
            if ((printEven && i % 2 == 0) || (!printEven && i % 2 != 0)) {
                System.out.println(list.get(i));
            }

        }
    }

    public static void main(String[] args) {
        List<Integer> newList = generateRandomList(10);
        System.out.println("Original list: " + newList);

        List<Integer> mirroredList = mirroredList(newList);
        System.out.println("Reversed mirrored list: " + mirroredList);

        System.out.println("\nEven positions:");
        printByPosition(newList, true);

        System.out.println("\nOdd positions:");
        printByPosition(newList, false);
    }
}
