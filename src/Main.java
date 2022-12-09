import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int countMonths = 0;
        double bankDeposit = 0;
        int monthlyPayment = 15_000;
        double monthlyDepositInterest = 0.01;
        double dream = 2_459_000.00;
        //предположим что в условии сказано про 12% годовый тоесть 1% в месяц
        while (bankDeposit < dream) {
            bankDeposit += bankDeposit * monthlyDepositInterest;
            bankDeposit += monthlyPayment;
            countMonths++;
            taskBankPrint(countMonths, bankDeposit);
        }
        System.out.println();
    }

    public static void taskBankPrint(int countMonths, double bankDeposit) {
        String str = String.format("%.2f", bankDeposit);
        // округляем до 2 знаков после запятой(округление используем только для вывода информации, но не для расчетов)
        String rub = str.substring(0, str.length() - 3);
        // оставляем только рубли`
        String kop = str.substring(str.length() - 2);
        // откидываем все кроме копеек
        System.out.printf("Месяц %d, сумма накоплений равна %s рублей %s коппеек \n", countMonths, rub, kop);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        long countPeople = 12_000_000L;
        double deathRatePerson = 8.00 / 1000.00;
        double birthRatePerson = 17.00 / 1000.00;
        for (int i = 1; i <= 10; i++) {
            countPeople += countPeople * (birthRatePerson);
            countPeople -= countPeople * (deathRatePerson);
            System.out.printf("Год %2d, численность населения составляет %8d \n", i, countPeople);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int countMonths = 0;
        double bankDeposit = 15000;
        double monthlyDepositInterest = 0.07;
        double dream = 12_000_000.00;
        while (bankDeposit < dream) {
            bankDeposit += bankDeposit * monthlyDepositInterest;
            countMonths++;
            taskBankPrint(countMonths, bankDeposit);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int countMonths = 0;
        double bankDeposit = 15000;
        double monthlyDepositInterest = 0.07;
        double dream = 12_000_000.00;
        while (bankDeposit < dream) {
            bankDeposit += bankDeposit * monthlyDepositInterest;
            countMonths++;
            if (countMonths % 6 == 0) taskBankPrint(countMonths, bankDeposit);
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        int finishCountMonths = 9 * 12;
        double bankDeposit = 15000;
        double monthlyDepositInterest = 0.07;
        for (int countMonths = 1; countMonths <= finishCountMonths; countMonths++) {
            bankDeposit += bankDeposit * monthlyDepositInterest;
            if (countMonths % 6 == 0) taskBankPrint(countMonths, bankDeposit);
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 1;
        int dayMonthly = 31;
        for (int i = firstFriday; i <= dayMonthly; i += 7) {
            System.out.printf("Сегодня пятница, %2d-е число. Необходимо подготовить отчет\n", i);
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cometFrequency = 79;
        int yearsStartComet = 0;
        int yearsNow = 2022;
        int yearsAgo200 = yearsNow - 200;
        int yearsNext100 = yearsNow + 100;
        for (int i = yearsStartComet; i < +yearsNext100; i += cometFrequency) {
            if (i >= yearsAgo200 && i <= yearsNow) {
                System.out.println(i);
            } else if (i > yearsNow) {
                System.out.println(i);
                break;
            }
        }
    }
}