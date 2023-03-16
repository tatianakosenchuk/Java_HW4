// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package HW4;

import java.util.LinkedList;
import java.util.Random;

public class Task4_1 {
    public static LinkedList Reverse(LinkedList<Integer> LinkList) {
        LinkedList<Integer> reversed = new LinkedList<Integer>();
        for (int element : LinkList) {
            reversed.add(0, element);
        }
        return reversed;
    }

    public static LinkedList RandLinkList(int size) {
        Random rand = new Random();
        LinkedList<Integer> linlist = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            linlist.add(rand.nextInt(101));
        }
        return linlist;
    }

    public static void main(String[] args) {
        LinkedList<Integer> lst = RandLinkList(10);
        System.out.println(lst);
        System.out.println(Reverse(lst));

    }
}
