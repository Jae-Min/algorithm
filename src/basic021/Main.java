package basic021;


import java.util.*;

/**
 * 중복제거 후 숫자가 한번이라도 입력되었으면 출력하시오.
 * case) 1 3 5 2 5 5 4 6 1 1
 * result) 1 2 3 4 5 6
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int index = 0;
        while(index < 10) {
            System.out.print("숫자를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            arr[index] = scanner.nextInt();
            index++;
        }
        logic(arr);
    }

    private static void logic(int[] arr) {
        Set<Integer> set = new HashSet();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int[] resArr = new int[set.size()];
        int index = 0;
        for(int number : set) {
            resArr[index] = number;
            index++;
        }

        Arrays.sort(resArr);
        for(int number : resArr) {
            System.out.print(number + " ");
        }
    }
}

