package pr3;
import java.lang.*;
import java.util.Arrays;

    public class Random {
        public static void main(String[] args){
            java.util.Random r = new java.util.Random();
            double [] arr = new double[10];
            System.out.println("Начальный массив: ");
            for ( int i = 0; i < arr.length; i++){
                arr[i] = r.nextDouble();
                System.out.println("Arr["+i+"] = " +arr[i]);
            }
            Arrays.sort(arr);
            System.out.println("Отсортированный ммассив: ");
            for (int i = 0; i < arr.length;i++){
                System.out.println("Arr[" +i+"] =" +arr[i]);
            }
        }
    }

