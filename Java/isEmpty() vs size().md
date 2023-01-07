# isEmpty() vs size()

**프로그래머스 > Java 어서와 자료구조와 알고리즘은 처음이지 > 실습 5-1. 올바른 괄호** 문제를 푸는 도중에 발생한 내용이다.

두 풀이의 차이는, isEmpty() 와 size() 사용 여부이다. 

### 풀이 1

* 테스트 케이스는 모두 통과하였으나, 이후 효율성 테스트에서 실패하였다.

```java
import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack <Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.size() != 0) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
```



<br>



### 풀이 2

* 테스트 케이스 및 효율성 테스트에서 모두 통과하였다. 

```java
import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack <Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
```



<br>

### 요약

> 참고: [stackoverflow: if(listStr.size == 0){ versus if(listStr.isEmpty()){](https://stackoverflow.com/questions/9341740/ifliststr-size-0-versus-ifliststr-isempty)

위의 링크를 참고하면, List에서 isEmpty() 의 경우 list가 비었는지 확인하기 때문에 시간 복잡도가 `O(1)` 이지만, size()의 경우 시간 복잡도가 자료구조에 따라 `O(1)` 또는 `O(N)` 이 걸릴 수 있으므로, 비었는지 확인하는 메소드를 사용할 때는 가급적이면 `isEmpty()` 사용을 권장한다고 한다. 