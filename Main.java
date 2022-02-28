import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        Q1(obj);
        Q2(obj);
        Q3(obj);
        Q4(obj);
        Q5(obj);
        Q6(obj);

    }

    public static void Q1(Scanner input) {

        LinkedList<Integer> LinkedList = new LinkedList<Integer>();

        LinkedList.add(1);
        LinkedList.add(3);
        LinkedList.add(5);
        LinkedList.add(7);
        LinkedList.add(9);
        LinkedList.add(11);
        /* Before */
        System.out.println(LinkedList);
        /* After */
        System.out.println("Insert a number into list: ");
        AddAndSort(LinkedList, input.nextInt());
        System.out.println(LinkedList);
    }

    public static void Q2(Scanner input) {

        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.add(1);
        LinkedList.add(3);
        LinkedList.add(5);
        LinkedList.add(7);
        LinkedList.add(9);
        LinkedList.add(11);
        /* Before */
        System.out.println(LinkedList);
        /* After */
        System.out.println("Swap 2 indexes in the list: ");
        Swap(LinkedList, input.nextInt(), input.nextInt());
        System.out.println(LinkedList);
    }

    public static void Q3(Scanner input) {

        LinkedList<Integer> LinkedList = new LinkedList<Integer>();

        for (int i = 0; i < 500; i++) {
            LinkedList.add((int) (Math.random() * (9999 - 1000 + 1)) + 1000);
        }

        /* Before */
        System.out.println(LinkedList);
        /* After */
        System.out.println("Search a number: ");
        int idx = FindValue(LinkedList, input.nextInt());
        System.out.println("Input number is found in index " + idx);
    }

    public static void Q4(Scanner input) {

        HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
        HashMap.put(0, 1);
        HashMap.put(1, 3);
        HashMap.put(2, 5);
        HashMap.put(3, 7);
        HashMap.put(4, 9);
        HashMap.put(5, 11);

        /* Before */
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
        /* After */
        System.out.println("Insert a number into HashMap: \n");
        AddAndSortHM(HashMap, input.nextInt());
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
    }

    public static void Q5(Scanner input) {

        HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
        HashMap.put(0, 1);
        HashMap.put(1, 3);
        HashMap.put(2, 5);
        HashMap.put(3, 7);
        HashMap.put(4, 9);
        HashMap.put(5, 11);

        /* Before */
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
        /* After */
        System.out.println("Swap 2 indexes in the HashMap: \n");
        SwapHM(HashMap, input.nextInt(), input.nextInt());
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
    }

    public static void Q6(Scanner input) {

        HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < 500; i++) {
            HashMap.put(i, (int) (Math.random() * (9999 - 1000 + 1)) + 1000);
        }

        /* Before */
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
        /* After */
        System.out.println("Search a number: ");
        int idx = FindValueHM(HashMap, input.nextInt());
        System.out.println("Input number is found in index " + idx);

    }

    public static void AddAndSort(LinkedList<Integer> list, int value) {
        int idx = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < value) {
                idx += 1;
                continue;
            } else {
                idx = list.indexOf(list.get(i));
                break;
            }

        }

        list.add(idx, value);

    }

    public static void Swap(LinkedList<Integer> list, int val1, int val2) {

        int listSize = list.size() - 1;
        if (val1 > listSize || val2 > listSize) {
            System.out.println("Index is out of range!");
            return;
        }

        int temp = list.get(val1);
        list.set(val1, list.get(val2));
        list.set(val2, temp);

    }

    public static int FindValue(LinkedList<Integer> list, int value) {

        if (list.contains(value)) {
            return list.indexOf(value);
        } else {
            return -1;
        }

    }

    public static void AddAndSortHM(HashMap<Integer, Integer> hashmap, int value) {

        hashmap.put(hashmap.size(), value);

        ArrayList<Integer> hmlist = new ArrayList<>(hashmap.values());
        hmlist.sort((a, b) -> a.compareTo(b));

        for (int i = 0; i < hashmap.size(); i++) {
            hashmap.put(i, hmlist.get(i));
        }

    }

    public static void SwapHM(HashMap<Integer, Integer> hashmap, int value, int value2) {

        int idx1 = hashmap.get(value);
        int idx2 = hashmap.get(value2);
        hashmap.put(value, idx2);
        hashmap.put(value2, idx1);
    }

    public static int FindValueHM(HashMap<Integer, Integer> hashmap, int value) {

        for (int i = 0; i < hashmap.size(); i++) {

            if (hashmap.get(i) == value) {
                return i;
            }

        }

        return -1;

    }

}