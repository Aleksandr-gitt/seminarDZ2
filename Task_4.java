/**
 * 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например : 
 * 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */


package HomeWork_1;
public class Task_4 {
 
 public static void main(String[] args) {
        String s = "1? + 3? = ?8";                      // можно вписать строку
        String[] words = s.split(" ");
        int res = 0;
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){                  
                    String newI=Integer.toString(i);
                    String newJ=Integer.toString(j);
                    String newK=Integer.toString(k);

                    String a = words[0];
                    a = a.replace("?", newI);
                    String b = words[2];
                    b = b.replace("?", newJ);
                    String c = words[4];
                    c = c.replace("?", newK);
                    
                    int x = Integer.parseInt (a);
                    int y = Integer.parseInt (b);
                    int z = Integer.parseInt (c);
                    
                    if (x+y == z){
                        System.out.printf("%d + %d = %d\n",x,y,z);
                        res = 1;   //можно без BREAK(здесь и ниже), чтобы вывести все варианты
                        break;         

                    }
                }
            if (res == 1) break; 
            }
        if (res == 1) break; 
        }
        if (res == 0){
            System.out.println("Нет подходящих вариантов ответа :(");
        }
    
    }
    
}