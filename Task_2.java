/**
 * 2. Вывести все простые числа от 1 до 1000
 */

package HomeWork_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число большее 10, для нахождения всех простых чисел от 0 до него :");
        int num = number.nextInt();
        System.out.print("1 2 3 ");
        number.close();
        for (int i=4; i <= num; i++){
            int count = 0;
            for (int j = 2; j<i; j++){
                if (i%j==0) {
                    count+=1; 
                    break;
                }else {
                    count=0;
                }
            } 
            if (count == 0) System.out.print(i+" "); 
        }
    
    }
}
