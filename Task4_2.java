// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
package HW4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task4_2 {
    public static LinkedList enqueue(LinkedList<Integer> LinkList, int new_element) {
        LinkList.add(new_element);
        System.out.println(LinkList);
        return LinkList;
    }

    public static LinkedList dequeue(LinkedList<Integer> LinkList) {
        System.out.println(LinkList.get(0));
        LinkList.remove(0);
        return LinkList;
    }

    public static Integer first(LinkedList<Integer> LinkList) {
        System.out.println(LinkList.get(0));
        return LinkList.get(0);
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
        Scanner input = new Scanner(System.in);
        System.out.printf(
                "\nChoose option:\n1 - enqueue() - помещает элемент в конец очереди\n2 - dequeue() - возвращает первый элемент из очереди и удаляет его\n3 - first() - возвращает первый элемент из очереди, не удаляя\n0 - exit\n");
        int ent = input.nextInt();
        if (ent == 1) {
            System.out.println("Enter value of new element");
            int new_el = input.nextInt();
            enqueue(lst, new_el);
        } else if (ent == 2) {
            dequeue(lst);
        } else if (ent == 3) {
            first(lst);
        } else if (ent == 0) {
            input.close();
        }
    }
}
