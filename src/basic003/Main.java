package basic003;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 가장 많이 출현한 숫자를 출력하세요.
 */
public class Main {

    public static void main(String[] args) {
        while(true) {
            System.out.print("수를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int[] arr = new int[input.length()];
            for(int i = 0; i < input.length(); i++) {
                arr[i] = Integer.parseInt(input.substring(i, i+1));
            }
            logic(arr);
        }
    }

    public static void logic(int[] input) {
        int[] arr = new int[10];
        for(int i = 0; i < input.length; i++) {
            arr[input[i]] += 1;
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(max == arr[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

