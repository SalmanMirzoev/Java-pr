package pr2;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        String[] mast = {"Пики", "Бубни", "Черви", "Крестье"};
        int players = 0;
        int cardsForPlayers = 5;
        int n = value.length* mast.length; //количество карт

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество игроков : ");
        for(;;){ //for(;;) - Бесконечный цикл
            players = scanner.nextInt();
            if (cardsForPlayers*players <= n && cardsForPlayers*players > 0){
                break;
            }
            else if (players < 0){
                System.out.println("Количество игроков не может быть отрицательным!");
            }
            else if (players == 0){
                System.out.println("Игра окончена!");
            }
            else
            {
                System.out.println("Игроков слишком много, карт в колоде будет недостаточно для игры.");
            }
        }
        String[] deck = new String[n]; //инициализация колоды
        for (int i = 0; i < value.length; i++){
            for (int j = 0; j < mast.length; j++){
                deck[mast.length*i + j] = value[i] + " " + mast[j];
            }
        }
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i)); // случайная карта в колоде
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        for (int i = 0; i < players * cardsForPlayers; i++) {
            System.out.println(deck[i]);
            if (i % cardsForPlayers == cardsForPlayers - 1)
                System.out.println();
        }
    }
}
