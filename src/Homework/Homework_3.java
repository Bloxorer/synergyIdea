package Homework;

import ForHomework.Tickets_new;

public class Homework_3 {
    static Tickets_new adults = new Tickets_new(9, 0, 70);
    static Tickets_new kids = new Tickets_new(11, 50, 70);
    static Tickets_new pension = new Tickets_new(5, 30, 70);
    public static void main(String[] args) {
        System.out.println("Цена билетов для взрослого: " + adults.calculate());
        System.out.println("Цена билетов для детей: " + kids.calculate());
        System.out.println("Цена билетов для пенсионеров: " + pension.calculate());
    }

}
