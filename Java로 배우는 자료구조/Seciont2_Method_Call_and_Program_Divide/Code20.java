package inflearn_Data_Structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

    // input.txt 파일로부터 이름과 전화번호 쌍을 입력받은 후,
    // 이름을 알파벳 순서로 정렬하여 출력한다.

    static String [] name = new String[100];
    static String [] number = new String[100];
    static int n = 0;

    public static void main(String[] args) {

        try {
            // file을 읽어올 때에 예외처리가 필요함.
            Scanner inFile = new Scanner(new File("inflearn_Data_Structure/input.txt"));

            while (inFile.hasNext()) {
                name[n] = inFile.next();
                number[n] = inFile.next();
                n++;
            }

            inFile.close();
        }  catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }

        // Code19와 달리, name, number and n이 클래스의 멤버이므로
        // 매개변수로 넘겨줄 필요가 없다.
        bubbleSort();

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " " + number[i]);
        }
    }

    // 문자열 간의 사전식 순서는 String Class 가 제공하는 CompareTo method를 이용해서 검사한다
    // str1.compareTo(str2)에서, str1의 사전식 순서가 str2보다 빠르면 음수, 같으면 0, 크면 양수를 반환한다
    // cf> 대소문자 없이 구분할 경우 compareToIgnoreCase() 사용

    private static void bubbleSort() {
        for(int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (name[j].compareTo(name[j + 1]) > 0){
                    String tmp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tmp;

                    // 이름을 swap 할 때 번호도 함께 swap 해줘야 함
                    tmp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = tmp;
                }
            }
        }
    }

}
