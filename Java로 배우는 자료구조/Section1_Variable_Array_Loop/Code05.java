package inflearn_Data_Structure;

import java.util.Scanner;

public class Code05 {

    public static void main(String[] args) {

        // in C, int grades[5];

        int [] grades;
        grades = new int[3];

        // assign some values to the array
        grades[0] = 100;
        grades[1] = 43;
        grades[2] = 73;


        // in C, it is impossible to use the variable length array
        // but, in recent C language, variable length array is allowed
        // const int n = 150;
        // int arr[n];

        // variable length array
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int [] arr = new int[k];

    }

}
