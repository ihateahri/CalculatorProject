package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");

        Scanner scanner = new Scanner(System.in);
        int result = 0;



        while (true){
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = scanner.next();

            if (operator.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            switch (operator) {
                case ("+"):
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case ("-"):
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case ("*"):
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case ("/"):
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                }
        }

    }
}
