package inflearn_Data_Structure;

public class Code01 {

    public static int num;

    public static void main(String[] args) {

        int anotherNum = 5;

        num = 2;

        System.out.println("Sum= " + num + anotherNum);     // left associativity
        // result: Sum= 25
        // Sum: 7 (x)

        System.out.println("Sum= " + (num + anotherNum));
        // result: Sum= 7

    }

}
