## Topic : 정렬

* 내 코드
```python
def solution(array, commands):
    answer = []
    for i in commands:
        array2 = array[i[0] - 1: i[1]]
        
        # sort 함수 사용
        array2.sort()
        answer.append(array2[i[2] - 1])
    return answer
```

```python
def solution(array, commands):
    answer = []
    for i in commands:
        array2 = array[i[0] - 1: i[1]]
        
        # Selection sort 사용
        for j in range(0, len(array2) - 1):
            for k in range(j + 1, len(array2)):
                if array2[j] > array2[k]:
                    array2[j], array2[k] = array2[k], array2[j]

        answer.append(array2[i[2] - 1])
    return answer
```

-------
* 다른 사람의 코드
```python
def solution(array, commands):
    return list(map(lambda x : sorted(array[x[0]-1:x[1]])[x[2]-1], commands))
```

```python
def solution(array, commands):
    answer = []
    for command in commands:
        i,j,k = command
        answer.append(list(sorted(array[i-1:j]))[k-1])
    return answer
```
