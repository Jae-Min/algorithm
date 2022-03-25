package basic004;

import java.util.Scanner;

/**
 * 십진수를 이진수로 바꾸시오
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] bin = new int[100];
        int i = 0;
        while(number > 0) {
            bin[i] = number % 2;
            number /= 2;
            i++;
        }
        i--;
        while(i >= 0) {
            System.out.print(bin[i]);
            i--;
        }
    }
}
