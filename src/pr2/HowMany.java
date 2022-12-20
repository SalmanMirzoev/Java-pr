package pr2;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите слова через пробел в одну строку");
        String input = s.nextLine();
        int count = 0; //счётчик слов

        if (input.length() != 0){
            if (input.charAt(0)!=' ') count++;
            for (int i = 0; i < (input.length() - 1); i++){
                if (input.charAt(i) == ' ' & input.charAt(i+1)!=' '){
                    count++;
                }
            }
        }
        System.out.println("Количество слов : " + count);
    }
}
/** Метод charAt () – возвращает символ, расположенный по указанному индексу строки.
 * Индексы строк в Java начинаются с нуля. Синтаксис. Синтаксис метода: public char charAt (int index) Параметры.
 * Подробная информация о параметрах: index – индекс символа, который необходимо получить из массива строки.
 * Возвращаемое значение. В Java charAt () возвращает символ из массива строки по указанному индексу.
 */
