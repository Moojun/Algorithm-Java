#### 2월 2일
* 성공: 11653
* 실패: 
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우): 
<br>



## 2월 3일부터 문제 이름, 티어 추가, 기록 양식 변경 + 쉬운 문제는 기록x

#### 2월 3일
* 성공
  * 3273(두 수의 합, **실버3**) 시간 초과를 방지하기 위해 Scanner 대신 BufferedReader 사용 및 코드를 조금 더 정교하게 짜야 한다. 
  * 10156(과자, **브론즈4**)
  * 1977(완전제곱수, **브론즈1**)
  * 10824(네 수,  **브론즈3**)나] BigInteger 사용, 다른 풀이] StringBuilder 사용 + Long.parseLong() : [참고1](https://bellossimo.tistory.com/35)
  * 10829(이진수 변환, **브론즈2**): **숫자 범위 확인하기**(NumberFormatException)-Long.parseLong()
* 실패
  * 1271(엄청난 부자2, **브론즈5**)  BigInteger 개념 확인
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우)
  * 3273-배열의 StartIndex, endIndex를 이용한 방식으로 다시 풀어보기



**한 줄에 여러 숫자 입력 받는 방법**

```
10 20 30 40 
```


1. 배열 선언 후 대입

2. StringTokenizer 사용

 ```java
   import java.io.BufferedReader;
   import java.io.IOException;
   import java.io.InputStreamReader;
   import java.util.StringTokenizer;
   
   public class Main {
   
       public static void main(String[] args) throws IOException, NumberFormatException {
           // 백준 10824 참조
           
           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           
           // 공백을 기준으로 문자열 분리
           StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
   
           int a1 = Integer.parseInt(st.nextToken());
           int a2 = Integer.parseInt(st.nextToken());
           int a3 = Integer.parseInt(st.nextToken());
           int a4 = Integer.parseInt(st.nextToken());
   
           bufferedReader.close();
   
       }
   }
 ```
  3, 배열로 입력받기

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        // 백준 10824 참조

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String [] arr = br.readLine().split(" ");

        br.close();
    }
}
```


#### 2월 4일
* 성공: 
  * 쉬운 문제 5개 품(브론즈 4~5)
* 실패: 
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우): 

#### 2월 5일
* 성공: 
  * 5597(과제 안 내신 분?, **브론즈2**)
    * 내 풀이: ArrayList 및 ArrayList-contains method 사용
    * 다른 풀이: 배열 사용 [참고1](https://dang2dangdang2.tistory.com/16)
* 실패:
  * 1453(피시방 알바, **브론즈2**)
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우): 

#### 2월 6일
* 성공: 
  * 1453(피시방 알바, **브론즈2**)
* 실패:
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우): 

#### 2월 7일
* 성공: 
  * 2417(정수 제곱근, **실버5**): 처음에 입력받는 정수 n을 long n = Long.parseLong으로 받았는데, 이후 데이터들을 int로 처리해서 틀렸었으나, long으로 단위를 변환하니 정답 처리됨.
* 실패:
  * 1037(약수, **실버5**)
  * 1316(그룹 단어 체커, **실버5**)
  * 1009(분산처리, **브론즈3**)
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우): 

#### 2월 8일
* 성공: 
  * 쉬운문제 2개
* 실패:
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우): 

#### 2월 9일
* 성공: 
  * 쉬운문제 1개
  * 1676(팩토리얼 0의 개수, **실버4**)
  * 4948(베르트랑 공준, **실버2**): 소수를 구하는 것(에라토스테네스의 체)과 관련된 문제인데, 소수를 구할 때 
  ```java
  //이 경우 시간초과
  for (int j = 2; j < i/2; j++) {

  }

  //이 경우 정상적으로 시간 내에 수행됨. -> 제곱근 사용
  for (int j = 2; j <= Math.sqrt(i); j++) {

  }
  ```
* 실패:
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우):
  * 1676(팩토리얼 0의 개수, **실버4**): 500!의 범위를 계산하기 위해 BigInteger를 사용했는데, 문제 의도는 이게 아니었다. **팩토리얼 규칙을 생각해서 간단하게 푸는 문제였음**
  * 4948(배열 사용해서 풀어보기), [참고](https://st-lab.tistory.com/85) - 비슷한 문제: 1929
