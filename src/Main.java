
public class Main {
    public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int age1 = 18;
        int age2 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.");
        }

        if (age2 < 18){
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно подождать.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int temperature = 4;

        if (temperature < 5 ) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку.");
        }

        else {
            System.out.println("На улице тепло, можно идти без шапки.");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int speedmore = 70;
        int speedless = 50;
        int speed = 60;

        if (speedmore > speed) {
            System.out.println("Если скорость " + speedmore + ", то придется заплатить штраф.");
        }

        if (speedless < speed) {
            System.out.println("Если скорость " + speedless + ", то превышения скорости нет, можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int age = 4;

        if (2 <= age && 6 >= age) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }

        else if (7 <= age && 18 >= age) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }

        else if (18 <= age && 24 >= age) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }

        else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int age = 16;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения.");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int total = 102;
        int seat = 60;
        int stay = 42;
        int soldSeat = 30;
        int soldStay = 20;
        if (soldSeat + soldStay == total) {
            System.out.println("Мест нет");
        } else if (seat > soldSeat) {
            System.out.println("Свободны " + (seat - soldSeat) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет");
        } if (stay > soldStay) {
            System.out.println("Свободны " + (stay - soldStay) + " стоячих мест.");
        } else {
            System.out.println("Стоячих мест нет");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int one = 4;
        int two = 3;
        int three = 2;
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее из трёх.");
        } else if (two > one && two > three){
            System.out.println("Число " + two + " большее из трёх.");
        } else {
            System.out.println("Число " + three + " большее из трёх");
        }
    }
}