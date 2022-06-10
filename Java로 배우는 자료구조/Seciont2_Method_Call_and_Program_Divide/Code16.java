package inflearn_Data_Structure;

import java.util.Scanner;

public class Code16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(power(a, b));

        sc.close();
    }

    private static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

}
