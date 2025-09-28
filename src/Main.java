//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //Задача 2


        for (i = 10; i > 1; i = i - 1) {
            System.out.println(i);

        }
        //Задача 3
        for (i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //Задача 4
        for (i = 10; i > -10; i = i - 1) {
            System.out.println(i);
        }
        //Задача 5


        for (i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным».");

        }
        //Задача 6
        for (i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // Задача 7
        for (i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задача8

        int monthlyDeposit = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlyDeposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        //Задача9
        for (int month = 1; month <= 12; month++) {
            totalSavings += ((monthlyDeposit / 100) * (12));
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        //Задача10

        for (i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }

    }
    }