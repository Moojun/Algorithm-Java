package inflearn_Data_Structure;

public class Code01 {

    public static void main(String[] args) {

        Person1 first;
        first = new Person1();   // 하나의 Person1 type의 객체(Object)를 생성하고, 그것을 first라고 한다

        first.name = "John";
        first.number = "01023456789";

        System.out.println("Name: " + first.name + ", Number: " + first.number);

        Person1 [] members = new Person1 [100];    // Person1 type의 배열도 만들 수 있다
        members[0] = first;
        members[1] = new Person1();
        members[1].name = "David";
        members[1].number = "1021341234";
        System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);


        // Java의 규칙
        // 모든 primitive type의 변수는 보통 변수이다. 즉 변수 자체에 값이 저장된다
        // primitive type이 아닌 모든 변수는 참조 변수이다.
        // 즉, 실제 데이터가 저장될 "객체"는 new 명령으로 따로 만들어야하고,
        // 참조변수에는 그 객체의 주소를 저장한다.

    }
}
