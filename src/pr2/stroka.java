package pr2;
import java.lang.*;
public class stroka {
    public static void main(String[] args) {
        String temp;
        String[] strings = {"Первый", "Второй", "Третий", "Четвёртый", "Пятый"};
        for (int i = 0; i < strings.length/2; i++){ // идем до середины, меняем концы
            temp = strings[i];
            strings[i] = strings[strings.length - i-1];
            strings[strings.length - i - 1] = temp;
        }
        for (int j = 0; j < strings.length; j++){
            System.out.println(strings[j]);
        }
    }
}