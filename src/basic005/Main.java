package basic005;

import java.util.Scanner;

/**
 * 대문자는 소문자로 소문자는 대문자로 변환하시오
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("영단어를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            logic(input);
        }
    }

    public static void logic(String input) {
        char[] charArr = input.toCharArray();
        System.out.println("charArr.length = " + charArr.length);
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] >= 'a' && charArr[i] <= 'z') {
                // 소문자인 경우
                charArr[i] = (char)('A' + (charArr[i]-'a'));
            } else {
                // 대문자인 경우
                charArr[i] = (char)('a' + (charArr[i]-'A'));
            }
        }

        System.out.println(String.copyValueOf(charArr));
    }
}
