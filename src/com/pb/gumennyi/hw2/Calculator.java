package com.pb.gumennyi.hw2;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = nextInt();
        int operand2 = nextInt();
        char operation = getOperation();
        int result = calc(operand1,operand2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int nextInt(){
        System.out.println("Введите число:");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                if (operand2 > 0){
            result = operand1/operand2;
                }
                else{
                    System.out.println("Операция Деление на 0 не допустима");}
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, operand2, getOperation());
        }
        return result;
    }
}