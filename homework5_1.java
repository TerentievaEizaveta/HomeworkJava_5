
/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре 
будут повторяющиеся имена с разными телефонами, их необходимо считать, 
как одного человека с разными телефонами. Вывод должен быть отсортирован 
по убыванию числа телефонов.
Пример ввода:
Иванов 234234
Иванов 32523
Иванов 5687
Иванов: 234234, 32523, 5687

Варианты Map:
Map<String, ArrayList>
Map<String, String>
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework5_1 {
    public static Map<String, ArrayList> bd = new HashMap<>();

    public static void add (String name, String phone){
        if (bd.containsKey(name)){
            ArrayList phones=bd.get(name);
            phones.add(phone);
            bd.put(name,phones);
        }
        else{
            ArrayList phones=new ArrayList();
            phones.add(phone);
            bd.put(name,phones);
        }
    }
    

    public static void main(String[] args){
        Scanner iS=new Scanner(System.in);
        System.out.print("1. \u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u043A\u043E\u043D\u0442\u0430\u043A\u0442\r\n" + //
                "2. \u0412\u044B\u0432\u0435\u0441\u0442\u0438 \u0432\u0441\u0435\u0445\r\n" + //
                "3. \u0412\u044B\u0445\u043E\u0434 :" );
        int n=iS.nextInt();
        switch(n){
            case 1: 
                add("Петров", "895633");
                add("Иванов"," 234234");
                add("Иванов", "32523");
                add("Иванов", "45666");
                /*
                while (true) {
                    String input = iS.nextLine();
                    if ("ex".equals(input)) break;
                    String[] s=input.split(" ");
                    add(s[0],s[1]);
                }
                */
            case 2: 
                for (HashMap.Entry<String, ArrayList> entry : bd.entrySet())
                {
                System.out.println(entry.getKey()  + " " + entry.getValue());
                }
            case 3: 
                break;
        }
       iS.close();
    }
}


