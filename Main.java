import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        Q1(obj);
        Q2(obj);
        Q3(obj);

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
        System.out.println("Random generated number is found in index " + idx);
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

}