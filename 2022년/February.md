##### 2월 2일
* 성공: 11653
* 실패: 
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우): 




#### 2월 3일부터 문제 이름, 티어 추가

##### 2월 3일
* 성공: 3273(두 수의 합, 실버3)- 시간 초과를 방지하기 위해 Scanner 대신 BufferedReader 사용 및 코드를 조금 더 정교하게 짜야 한다. 10156(과자, 브론즈4)
* 실패: 1271(**BigInteger 개념 확인**)
* 성공하였으나 나중에 다시 볼 것(풀이 참조한 경우): 3273-배열의 StartIndex, endIndex를 이용한 방식으로 다시 풀어보기



**BufferedReader를 사용해서 한 줄에 여러 숫자 입력 받기**

1. 배열 선언 후 대입

2. ```java
   import java.io.BufferedReader;
   import java.io.IOException;
   import java.io.InputStreamReader;
   import java.util.StringTokenizer;
   
   public class Main {
   
       public static void main(String[] args) throws IOException, NumberFormatException {
           // 백준 2805 참조
   
           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           
           // 공백을 기준으로 문자열 분리
           StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
   
           int n = Integer.parseInt(stringTokenizer.nextToken());
   		int m = Integer.parseInt(stringTokenizer.nextToken());
   
           bufferedReader.close();
   
       }
   }
   ```

