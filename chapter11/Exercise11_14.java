package chapter11;

import java.io.*;
import java.util.*;
class Exercise11_14
{
    static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]) throws IOException {
        while(true) {
            switch(displayMenu()) {
                case 1 :
                    inputRecord();
                    break;
                case 2 :
                    displayRecord();
                    break;
                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        } // while(true)
    }
    // menu를 보여주는 메서드
    static int displayMenu() throws IOException {
        System.out.println("**************************************************");
        System.out.println("*성적 관리 프로그램*");
        System.out.println("**************************************************");
        System.out.println();
        System.out.println(" 1. 학생성적 입력하기");
        System.out.println();
        System.out.println(" 2. 학생성적 보기");
        System.out.println();
        System.out.println(" 3. 프로그램 종료");
        System.out.println();
        System.out.print(" .(1~3) : 원하는 메뉴를 선택하세요");
        int menu = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            menu = Integer.parseInt(br.readLine());
            if (menu == 1 || menu == 2|| menu == 3) break;
            System.out.print("메뉴선택이 잘못되었습니다. (1~3) : ");
        } while(true);
        return menu;
    } // public static int displayMenu(){
// 데이터를 입력받는 메서드
    static void inputRecord() throws IOException {
        System.out.println("1.학생성적 입력하기");
        System.out.println("이름 반 번호 국어성적 영어성적 수학성적 의 순서로 공백없이 입력하세요");
        System.out.println(" 입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
        while (true) {
            System.out.print(">>");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String data = br.readLine();

            if (data.equalsIgnoreCase("q")) break;
            try{
                String[] arr = data.split(",");

                record.add(new Student3(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5])));
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
            /*
(2) . 아래의 로직에 맞게 코드를 작성하시오
1. Scanner .(',' ) 를 이용해서 화면으로 부터 데이터를 입력받는다 를 구분자로
2. q Q , 입력받은 값이 또는 이면 메서드를 종료하고
그렇지 않으면 입력받은 값으로 인스턴스를 생성하고 에 추가한다 Student record .
3. , " ." . 입력받은 데이터에서 예외가 발생하면 입력오류입니다 를 보여주고 다시 입력받는다
4. q Q 2~3 . 또는 가 입력될 때까지 의 작업을 반복한다
*/
        } // end of while
    }
 // public static void inputRecord() {
    // 데이터 목록을 보여주는 메서드
    public static void displayRecord() {
        int koreanTotal = 0;
        int englishTotal = 0;
        int mathTotal = 0;
        int total = 0;
        int length = record.size();
        if(length > 0) {
            System.out.println();
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
            System.out.println("====================================================");
            for (int i = 0; i < length ; i++) {
                Student3 student = (Student3)record.get(i);
                System.out.println(student);
                koreanTotal += student.kor;
                mathTotal += student.math;
                englishTotal += student.eng;
                total += student.total;
            }
            System.out.println("====================================================");
            System.out.println("총점 : "+koreanTotal+" "+englishTotal
                    +" "+mathTotal+" "+total);
            System.out.println();
        } else {
            System.out.println("====================================================");
            System.out.println("데이터가 없습니다 .");
            System.out.println("====================================================");
        }
    } // static void displayRecord() {
}
class Student3 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;
    int classRank; // 반등수
    Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public int compareTo(Object o) {
        if(o instanceof Student3) {
            Student3 tmp = (Student3)o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                +","+schoolRank
                +","+classRank
                ;
    }
} // class Student