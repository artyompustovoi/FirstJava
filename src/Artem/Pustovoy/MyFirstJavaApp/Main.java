package Artem.Pustovoy.MyFirstJavaApp;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isWholeNumber(double number) {
        return Math.floor(number) == number;
    }

    public static long swapBytes(long number) {///функция написана с использованием chatgpt
        long swappedNumber = ((number >> 16) & 0x0000FFFF) | ((number << 16) & 0xFFFF0000);
        return swappedNumber;
    }
    public static void main(String[] args) {
        short choice;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Ведите год для проверки (положительное четырехзначное число)");

            short year = sc.nextShort();
            while (year < 1000 || year > 9999) {
                System.out.println("Веденное число не является положительным и четырехзначным\nПопробуйте еще раз");
                year = sc.nextShort();
            }
            if (year % 4 == 0 && year % 100 != 0
                    || year % 400 == 0) {
                System.out.println("Введенный вами год " + year + " является високосным");
            } else {
                System.out.println("Введенный вами год " + year + " не является високосным");
            }
            System.out.println("Для перехода к следующему заданию введите 2" +
                    "\nДля повтора ввидетие любое другое число");
            choice = sc.nextShort();
            if (choice == 2)
                break;
        }
        while (true) {
            System.out.println("Введите целое положительное число не привышающее 2 в 32 степени");
            double number = sc.nextDouble();
            while (number > Math.pow(2, 32) || number < 1 || !isWholeNumber(number)) {
                System.out.println("Веденное число не является положительным целым не превышающим 2 в 32 степениn" +
                        "\nПопробуйте еще раз");
                number = sc.nextDouble();
            }
            System.out.println("Результат вычисления программы: "+swapBytes((long)number));
            System.out.println("Для перехода к следующему заданию введите 3" +
                    "\nДля повтора ввидетие любое другое число");
            choice = sc.nextShort();
            if (choice == 3)
                break;
        }
        while (true) {
            System.out.println("Введите натуральное число, не превышающее 2 в 31 степени");
            double number = sc.nextDouble();
            while (number > Math.pow(2, 31) || number < 0) {
                System.out.println("Веденное число не является натуральным числом, не превышающим 2 в 31 степени" +
                        "\nПопробуйте еще раз");
                number = sc.nextDouble();
            }
            long counter = 0;
            while(number!=1){
                if(number%2==0)
                    number=number/2;
                else
                    number=number*3+1;
                counter++;

            }
            System.out.println("Число итераций: "+counter);
            System.out.println("Для завершения введите 0" +
                    "\nДля повтора ввидетие любое другое число");
            choice = sc.nextShort();
            if (choice == 0)
                break;
        }
    }
}