package pr2;
import java.util.Scanner;
import java.util.*;

public class Shop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество компьютеров для ввода");
        int size = input.nextInt();

        System.out.println("Введите компьютеры");
        ArrayList<String> arrayList = new ArrayList<>(size); // Создаем новый список динамического массива
        for (int i = 0; i < size; i++) {
            arrayList.add(i, input.next()); // установка нового элемента add - создаём
        }

        System.out.println("Список введенных компьютеров: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + " " + arrayList.get(i));
        }

        String end = "Конец";
        String add = "Добавить";
        String res = "Найти";
        String del = "Удалить";
        String variant = "var";
        while (!(variant.equals(end))) {
            System.out.println("Вы хотите 'Добавить' , 'Удалить' или 'Найти'? \nЕсли хотите закончить напишите 'Конец'.");
            variant = input.next();
            if (variant.equals(add)) {
                //добавление компов

                System.out.println("Какой компьютер Вы хотите добавить?");
                String search1 = input.next();
                arrayList.add(search1);

                for (int j = 0; j < arrayList.size(); j++) {
                    System.out.println(j + " " + arrayList.get(j));
                }
            }
            else if (variant.equals(res)) {

                System.out.println("Введите, какой компьютер Вы хотите найти: ");
                String search;
                search = input.next();
                int arrayIndex = arrayList.indexOf(search); // Поиск элемента по значению
                if (arrayIndex >= 0) System.out.println("Ваш компьютер расположен под индексом: " + arrayIndex);
                else System.out.println("Не найдено");

                for (int j = 0; j < arrayList.size(); j++) {
                    System.out.println(j + " " + arrayList.get(j));
                }
            } else if (variant.equals(del)) {

                // удаление элемента по значению

                System.out.println("Введите индекс компьютера, который Вы хотите удалить.");
                int index = input.nextInt();
                arrayList.remove(index);

                System.out.println("Теперь список компьютеров выглядит так : ");
                for (int j = 0; j < arrayList.size(); j++) {
                    System.out.println(j + " " + arrayList.get(j));
                }
            }
        }
    }
}
