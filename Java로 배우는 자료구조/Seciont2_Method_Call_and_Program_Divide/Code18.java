package inflearn_Data_Structure;

import java.util.Scanner;

public class Code18 {

    /* 사용자로부터 n개의 정수를 입력받은 후 오름차순으로
    정렬(sort)하여 출력하는 코드이다. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] data = new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
        }

        bubbleSort(data);

        sc.close();
    }

    // Call by value: array
    // swap(arr[i], arr[j])에서는 값이 변경되지 않았으나,
    // 배열은 값이 변경되었다.
    // Primitive type: byte, short, int, long, float, double, char, boolean
    // Primitive type의 매개변수는 호출된 메서드에서 값을 변경하더라도 호출한 쪽에 영향을 주지 못한다.
    // 이것은 call by value(값에 의한 호출)이기 때문이다.
    // 그러나 배열의 값은 호출한 메서드에서 변경하면 호출한 쪽에서도 변경된다.
    private static void bubbleSort(int [] arr) {

        for (int i = 0; i < arr.length ; i++) {

            for (int j = i + 1; j < arr.length; j++ ) {
                if (arr[i] > arr[j]) {

                    // Call by Value(값에 의한 호출)
                    //swap(arr[i], arr[j]);   // arr[i], arr[j] : actual parameter
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    // cf> Call by reference: not in C, Java. but in C++
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    // 이런 식으로 작성하면 안된다.
    static void swap(int a, int b) {    // int a, int b : formal parameter
        int temp = a;
        a = b;
        b = temp;
    }

}
