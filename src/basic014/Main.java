package basic014;

import java.util.Scanner;

/**
 * 입력된 수의 숫자 개수를 출력하시오
 * case)   4123555
 * result)
 * 0: 0
 * 1: 1
 * 2: 1
 * 3: 1
 * 4: 1
 * 5: 3
 * 6: 0
 * 7: 0
 * 8 :0
 * 9: 0
 */

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("수를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            logic(scanner.nextLong());
        }
    }

    private static void logic(long number) {
        System.out.println("result)");
        int[] arr = new int[10];
        while(number > 0) {
            arr[(int) (number % 10)]++;
            number /= 10;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(i+": "+arr[i]);
        }
    }
}
