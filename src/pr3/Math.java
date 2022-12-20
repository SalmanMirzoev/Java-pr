package pr3;
import java.lang.*;

public class Math {
    public static void main(String[] args) {
        double[] arr = new double[10];
        System.out.println("Начальный массив:");
        for (int i = 0; i < arr.length; i++) {
            double a = java.lang.Math.random();
            arr[i]=a;
            System.out.println("Arr[" + i + "]= " + a);
        }
        System.out.println("Отсортированный массив:");
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.16f",arr[i]);
            System.out.println();
        }
    }

    public static int random() {
        return 0;
    }
}