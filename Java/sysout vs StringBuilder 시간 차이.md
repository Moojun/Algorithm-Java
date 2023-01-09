# sysout vs StringBuilder 시간 차이

백준 `17298, 오큰수` 문제를 푸는 과정에서 알게 된 내용임



### 풀이 1: 시간초과

* 코드 마지막에 for 반복문을 돌면서 결과를 출력

```java
import java.io.*;
import java.util.*;

// 17298
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < N + 1; i++) {

            while (!stack.isEmpty()) {
                int num = stack.peek();
                if (arr[num] < arr[i]) {
                    arr[num] = arr[i];
                    stack.pop();

                } else {
                    break;
                }
            }
            stack.push(i);

        }

        while(!stack.isEmpty()) {
            int num = stack.pop();
            arr[num] = -1;
        }

        for (int i = 1; i < N + 1; i++) {
            System.out.print(arr[i] + " ");
        }

        br.close();
    }
}
```



<br>



### 풀이 2: 시간 초과 발생하지 않음

* StringBuilder를 이용해서 출력

```java
import java.io.*;
import java.util.*;

// 17298
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < N + 1; i++) {

            while (!stack.isEmpty()) {
                int num = stack.peek();
                if (arr[num] < arr[i]) {
                    arr[num] = arr[i];
                    stack.pop();

                } else {
                    break;
                }
            }
            stack.push(i);

        }

        while(!stack.isEmpty()) {
            int num = stack.pop();
            arr[num] = -1;
        }

        sb = new StringBuilder();
        for (int i = 1; i < N + 1; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb.toString());

        br.close();
    }
}
```



<br>

### 풀이 3: 시간 초과 발생하지 않음

* BufferedWriter 사용

```java
import java.io.*;
import java.util.*;

// 17298
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < N + 1; i++) {

            while (!stack.isEmpty()) {
                int num = stack.peek();
                if (arr[num] < arr[i]) {
                    arr[num] = arr[i];
                    stack.pop();

                } else {
                    break;
                }
            }
            stack.push(i);

        }

        while(!stack.isEmpty()) {
            int num = stack.pop();
            arr[num] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i < N + 1; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
```







<br>



### 읽어볼 링크들

> [17298 백준 자바 풀이](https://ilmiodiario.tistory.com/128)
>
> [StringBuilder vs Sysout 시간차이 확인해보기](https://www.blog.ecsimsw.com/entry/Java-StringBuilder-모아서-출력-vs-매번-출력)





### 결론

* 반복해서 출력해야하는 경우가 많으면 StringBuilder로 모아서 출력하자.