// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1 + 2 ответ: 3 + 4 ответ: 7 Отмена 3 * 3 ответ: 9
// Пример 2
// Ввод: 1 Ввод: + Ввод: 2 Вывод: 3 Ввод:+ Ввод:4 Вывод 7 Ввод:* Ввод:3 Вывод 21 Отмена Вывод 7 Отмена Вывод 3 Ввод:- Ввод:1 Вывод 2
// Дополнительно каскадная отмена - отмена нескольких операций
package HW4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4_3 {
    public static int calc(int num1, int num2, String sign) {
        int result = 0;
        if (sign.equals("+")) {
            result = num1 + num2;
        } else if (sign.equals("-")) {
            result = num1 - num2;
        } else if (sign.equals("/")) {
            result = num1 / num2;
        } else if (sign.equals("*")) {
            result = num1 * num2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf(
                "Calculator started\nEnter first value\n To stop program enter 'exit'/n or cancel operation enter'cancel'\n");
        String ent = input.nextLine();
        if (ent.equals("exit")) {
            input.close();
        }
        String num1 = ent;
        String sign = input.nextLine();
        String num2 = input.nextLine();
        int res = calc(Integer.parseInt(num1), Integer.parseInt(num2), sign);
        System.out.println(res);
        ent = input.nextLine();
        Deque<Integer> qlist = new LinkedList<Integer>();
        while (!ent.equals("exit")) {
            if (!ent.equals("cancel")) {
                num1 = Integer.toString(res);
                num2 = input.nextLine();;
                sign = ent;
                res = calc(Integer.parseInt(num1), Integer.parseInt(num2), sign);
                qlist.addFirst(res);
            } else {
                qlist.pollFirst();
                res = qlist.getFirst();
            }
            System.out.println(res);
            ent = input.nextLine();
        }
        input.close();
    }

}
