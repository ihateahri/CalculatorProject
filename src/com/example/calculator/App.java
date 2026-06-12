package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("첫 번째 숫자를 입력하세요 (exit 입력시 종료): ");
            String input = scanner.next();

            if (input.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
            // 문자열로 받은 input을 정수형으로 변경해야 계산을 할수 있음으로 int형으로 변환
            int num1 = Integer.parseInt(input);

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = scanner.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            int result = calculator.calculator(num1, num2, operator);

            System.out.println(num1 + operator + num2 + " = " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            System.out.println("저장된 결과 : " + calculator.getResultList());
            calculator.setResultList(new ArrayList<>());

            calculator.removeResult();
        }
    }
}
