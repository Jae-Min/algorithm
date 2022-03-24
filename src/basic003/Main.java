package basic003;

/**
 * 가장 많이 출현한 수를 출력하세요.
 */
public class Main {

    public static void main(String[] args) {

        int[] input = {1, 1, 1, 2, 2, 2, 0};

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
    }
}

