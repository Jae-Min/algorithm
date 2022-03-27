package basic006;

import java.util.Scanner;

/**
 * 최대공약수 구하기
 */
public class Main {

    public static void main(String[] args) {
        while(true) {
            System.out.print("첫번째 수를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            System.out.print("두번째 수를 입력하세요: ");
            scanner = new Scanner(System.in);
            int num2 = scanner.nextInt();
            logic(num1, num2);
        }
    }

    public static void logic(int num1, int num2) {
        int len = num1 > num2 ? num2 : num1;
        int max = 0;
        for(int i = 1; i <= len; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                max = i;
            }
        }
        System.out.println("최대공약수는 " + max +"입니다.");
    }
}
