package basic001;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 학생 정보를 저장하고, 이름으로 검색했을 때 학번을 출력하는 프로그램
 *
 * Student 클래스 생성
 * String name, String no
 *
 * 학생들을 ArrayList에 저장한 후
 * 계속 검색하겠는가? y -> 반복, n -> 프로그램 종료
 *
 * 이름으로 조회한 결과가 있는 경우 해당 학생의 학번을 출력
 * 이름으로 조회한 결과가 없는 경우 "학생 이름이 존재하지 않음" 을 출력
 */
public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Student st1 = new Student("손오공", "1000");
        Student st2 = new Student("저팔계", "2000");
        Student st3 = new Student("사오정", "3000");
        students.add(st1);
        students.add(st2);
        students.add(st3);

        while(true) {
            System.out.println("계속 검색하시겠습니까? (y/n)");
            String flag = scanner.next();
            if(flag.equalsIgnoreCase("Y")) {
                search();
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }

    private static void search() {
        System.out.println("조회할 이름을 입력하세요");
        String name = scanner.next();

        boolean flag = false;
        for(Student student : students) {
            if(student.getName().equals(name)) {
                System.out.println(student.getNo());
                flag = true;
            }
        }

        if(!flag) {
            System.out.println("학생 이름이 존재하지 않습니다.");
        }
    }

}
