package ScannerFindMinAndMaxValue;

import java.util.Scanner;

public class FinderScanner {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.println("Enter 1st number");
        num1 = scanner.nextInt();
        System.out.println("Enter 2nd number");
        num2 = scanner.nextInt();
        System.out.println("Enter 3rd number");
        num3 = scanner.nextInt();
        System.out.println("Enter 4th number");
        num4 = scanner.nextInt();
        System.out.println("Enter 5th number");
        num5 = scanner.nextInt();

        int tab[] = {num1, num2, num3, num4, num5};

        int minimal = tab[0];
        int maximal = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < minimal) {
                minimal = tab[i];
            }
        }
        System.out.println("The smallest number is: " + minimal);

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > maximal) {
                maximal = tab[i];
            }
        }
        System.out.println("The biggest number is: " + maximal);

    }
}
