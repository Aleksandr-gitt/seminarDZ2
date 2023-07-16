package HomeWork_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Что будем делать?");
        System.out.println("Сложение(+), Вычитание(-), Умножение(*), Деление(/) :");
        String choice = scan.nextLine();
        System.out.println("Введите первое число :");
        double a = scan.nextInt();
        System.out.println("Введите второе число :");
        double b = scan.nextInt();
        scan.close();
        double c;
        switch (choice) {
            case "+":
                c = a+b;
                System.out.printf("%1.2f + %1.2f = %1.2f \n", a,b,c);
                break;
            case "-":
                c = a-b;
                System.out.printf("%1.2f - %1.2f = %1.2f \n", a,b,c);
                break;
            case "*":
                c = a*b;
                System.out.printf("%1.2f * %1.2f = %1.2f \n", a,b,c);
                break;
            case "/":
                c = a/b;
                System.out.printf("%1.2f / %1.2f = %1.2f \n", a,b,c);
                break;
            default: System.out.println("Я таким не занимаюсь!!!");
                break;
        }
    }
    
}
