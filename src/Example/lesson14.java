package Example;

import java.util.Scanner;

public class lesson14 {
    public static void main(String[] args) {
        System.out.println("Введите номер билета:");
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Вы ввели текст:" + input);
    }
}
