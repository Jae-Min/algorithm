package basic006;

import java.util.Scanner;

/**
 * 최대공약수 구하기
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int len = num1 > num2 ? num2 : num1;
        int max = 0;
        for(int i = 1; i <= len; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                max = i;
            }
        }

        System.out.println(max);
    }
}
