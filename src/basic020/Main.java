package basic020;

import java.util.Scanner;

/**
 * n번째까지 369게임 결과를 아래와 같이 출력하시오.
 * result) 1 2 짝 4 5 짝 7 8 짝 ... 28 짝 짝 짝 짝 짝짝 작 ... 짝짝 100 ...
 */

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("n: ");
            Scanner scanner = new Scanner(System.in);
            logic(scanner.nextInt());
        }
    }

    private static void logic(int n) {
        for(int i = 1; i <= n; i++) {
            int count = 0;
            int value = i;
            while(value > 0) {
                if(value % 10 == 3 || value % 10 == 6 || value % 10 == 9) {
                    count++;
                }
                value /= 10;
            }

            if(count > 0) {
                String rtnVal = "";
                while(count > 0) {
                    rtnVal += "짝";
                    count--;
                }
                System.out.print(rtnVal);
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

}

