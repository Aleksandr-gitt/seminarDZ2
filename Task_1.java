/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
package HomeWork_1;
import java.util.Scanner;
public class Task_1 {

    static int fakt(int n) {
        if (n == 1) return 1;
        return n*fakt(n-1);
    }
    static int Noe(int n) {
        if (n == 1) return 1;
        return n+Noe(n-1);    
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Что будем искать? N-ое треугольное число(1) или факторил числа(2)?");
        System.out.println("Каков Ваш выбор?(1 или 2) :");
        int choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Введите число для вывода результата Вашего запроса :");
                int choice1 = scan.nextInt();
                scan.close();
                int res1 = Noe(choice1);
                System.out.println("Ответ на Ваш запрос "+ res1);
                break;
            case 2:
                System.out.println("Введите число для вывода результата Вашего запроса :");
                int choice2 = scan.nextInt();
                scan.close();
                int res2 = fakt(choice2);
                System.out.println("Ответ на Ваш запрос "+ res2);
                break;
            default: 
                System.out.println("Вы выбрали не ту таблетку");
                break;
            
        } 
        }
}
    

