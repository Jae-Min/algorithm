package basic024;

import java.util.Scanner;

/**
 * 학생수와 점수들이 순서대로 입력됐을 때, 평균을 넘은 학생의 비율을 출력하시오.
 * case) 학생수:5, 점수: 40, 70, 60, 100, 80
 * result) 40
 */

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("학생수를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
            int[] arr = new int[count];
            for(int i = 0; i < count; i++) {
                System.out.print((i + 1) + "번 학생의 점수를 입력하세요: ");
                arr[i] = scanner.nextInt();
            }

            logic(arr);
        }
    }

    private static void logic(int[] scores) {

        int sum = 0;
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        int count = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > average)
                count++;
        }
        System.out.println((double) count / scores.length * 100 );
    }
}
