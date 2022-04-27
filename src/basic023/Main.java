package basic023;

import java.util.Scanner;

/**
 * 입력된 문자열을 뒤집어서 출력하시오
 * case) abcde
 * result) edcba
 */

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("문자열을 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            logic(scanner.nextLine());
        }
    }

    private static void logic(String input) {

        char[] tmp = new char[input.length()];
        char[] cArr = input.toCharArray();
        int index = tmp.length - 1;
        for(int i = 0; i < cArr.length; i++) {
            tmp[index] = cArr[i];
            index--;
        }

        System.out.println(String.copyValueOf(tmp));
    }
}