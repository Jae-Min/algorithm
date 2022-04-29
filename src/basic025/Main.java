package basic025;


import java.util.Scanner;

/**
 * N (1 <= N <= 100)이 주어졌을 때 N의 사이클의 길이를 구하시오.
 * case) 26
 * 26 -> 2 + 6 = 8 -> 68 (1 사이클)
 * 68 -> 6 + 8 = 14 -> 84 (2 사이클)
 * 84 -> 8 + 4 = 12 -> 42 (3 사이클)
 * 42 -> 4 + 2 = 6 -> 26 (4 사이클)
 * result) 4
 */

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("1부터 100사이의 값을 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            logic(scanner.nextInt());
        }
    }

    private static void logic(int n) {

        int answer = 0;
        int res = n;
        int tmp = 0;
        do {
            answer++;
            tmp = res / 10 + res % 10;
            res = res % 10 * 10 + tmp % 10;
        } while(n != res);

        System.out.println("answer = " + answer);



    }
}
