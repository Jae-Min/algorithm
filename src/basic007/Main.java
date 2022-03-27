package basic007;

import java.util.Scanner;

/**
 * 소수판별
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("자연수를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            logic(input);
        }
    }
    public static void logic(int input) {
        int len = (int) Math.sqrt(input);
        boolean flag = true;
        for(int i = 2; i <= len; i++) {
            if(input % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println(input + "은 소수입니다.");
        else System.out.println(input  + "은 소수가 아닙니다.");
    }
}
