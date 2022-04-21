package basic022;

import java.util.*;

/**
 * 입력된 수가 팰린드롬인지 판별하시오.
 * case) 12321
 * result) true
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

    private static void logic(int[] arr) {
        boolean flag = true;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[arr.length-1-i]) {
                flag = false;
                break;
            }
        }
        System.out.println("palindrome: " + flag);
    }
}
