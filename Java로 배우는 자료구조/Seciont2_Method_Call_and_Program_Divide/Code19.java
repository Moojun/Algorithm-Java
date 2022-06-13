package inflearn_Data_Structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

    // input.txt라는 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아
    // 배열에 저장하고 출력한다

    public static void main(String[] args) {

        String [] name = new String[100];
        String [] number = new String[100];
        int n = 0;

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

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " " + number[i]);
        }

    }
}
