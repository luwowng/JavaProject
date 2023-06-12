package p8255;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int number1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        double quotient = (double) number1 / number2;

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);

        scanner.close();
    }
}
