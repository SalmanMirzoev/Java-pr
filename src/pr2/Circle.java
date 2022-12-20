package pr2;

import java.util.Scanner;

public class Circle {
        private int R;
        public double S,L;

        public int getR() {
            return R;
        }
        public void setR(int R) {
        this.R = R;
        }
        public double S() {
            S = 3.14 * R * R;
            System.out.printf("S="+"%.2f",S);
            return S;
        }

        public double L() {
            L=2*3.14*R;
            System.out.printf("L="+"%.2f",L);
            return L;
        }

        public void Srav() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ввидите радиус1 ");
            int R1 = sc.nextInt();
            setR(R1);
            double S1 = S();
            System.out.println();
            double L1 = L();
            System.out.println();
            System.out.println("Ввидите радиус2 ");
            int R2 = sc.nextInt();
            setR(R2);
            double S2 = S();
            System.out.println();
            double L2 = L();
            System.out.println();
            System.out.println("Сравнение:");
            if (S1>S2){
                System.out.println("S1>S2");
            }
            else if (S1==S2) {
                System.out.println("S1=S2");
            }
            else{
                System.out.println("S1<S2");
            }
            if (L1>L2){
                System.out.println("L1>L2");
            }
            else if (L1==L2) {
                System.out.println("L1=L2");
            }
            else{
                System.out.println("L1<L2");
            }


        }
}
