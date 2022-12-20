package pr3;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class nature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = 0;
        while (n <= 3) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 3) {
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (int) ( java.lang.Math.random() * (n + 1));
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int [] arr2 = new int[count];
        int ind = 0;
        for (int i = 0; i < n; i++){
            if (arr[i]%2 == 0){
                arr2[ind]=arr[i];
                ind++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
