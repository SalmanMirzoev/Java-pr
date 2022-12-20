package pr2;

import pr2.Author;

import java.util.Scanner;

    public class TestAuthor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Author X = new Author();
            System.out.println("введите email");
            String email = sc.next();
            X.setEmail(email);
            System.out.printf(X.toString());
            System.out.println();
            System.out.println("проверка через гетттеры ");
            String a = X.getEmail();
            String b = X.getname();
            char c = X.getGender();
            System.out.println(a+" "+b+" "+c);
        }
    }

