package inflearn_Data_Structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22 {

    // 입력으로 하나의 텍스트 파일을 읽는다.
    // 텍스트 파일에 등장하는 모든 단어들의 목록을 만들고, 각 단어가 텍스트 파일에
    // 등장하는 횟수를 센다. 단, 단어 개수는 100,000개 이하라고 가정한다
    // 사용자가 요청하면 단어 목록을 하나의 파일로 저장한다
    // 사용자가 단어를 검색하면 그 단어가 텍스트 파일에 몇 번 등장하는지 출력한다

    static String [] words = new String[100000];
    static int [] count = new int[100000];
    static int num = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            String command = sc.next();

            if (command.equals("read")) {
                String fileName = sc.next();
                makeIndex(fileName);
            }
            else if (command.equals("find")) {
                String str = sc.next();
                int index = findWord(str);
                if (index != -1 ) {
                    System.out.println("The word " + words[index] + " appears " + count[index]
                    + " times");
                }
                else    // index = -1인 경우
                    System.out.println("The word " + str+ " does not appear.");

            }
            else if (command.equals("saveas")) {
                // file 로 저장한다
                String fileName = sc.next();
                saveAs(fileName);
            }
            else if (command.equals("exit")) {
                break;
            }

        }
        sc.close();

        for (int i = 0; i < num; i++) {
            System.out.println(words[i] + " " + count[i]);
        }
    }

    static void makeIndex(String fileName) {

        try {
            Scanner inFile = new Scanner(new File(fileName));

            while (inFile.hasNext()) {
                String str = inFile.next();

                addWord(str);
            }

            inFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("No file");
            return;
        }
    }

    static void addWord(String str) {
        int index = findWord(str);  // return -1 if not found
        if (index != -1 ) {
            // found words[index] == str
            count[index]++;
        }
        else {
            // not found
            words[num] = str;
            count[num] = 1;
            num++;
        }
    }

    static int findWord(String str) {
        for (int i = 0; i < num; i++) {
            if (words[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    static void saveAs(String fileName) {
        try {
            // 암기 필요
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for (int i = 0; i < num; i++) {
                outFile.println(words[i] + " " + count[i]);
            }

            outFile.close();
        } catch(IOException e) {
            System.out.println("Save failed");
        }

    }




}
