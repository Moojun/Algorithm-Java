### 이름에 el이 들어가는 동물 찾기
* 출처 : 프로그래머스
* MYSQL

```sql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE NAME LIKE '%el%'
AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME ASC;
```

--------
* 참고사항
  * 만약 문자열 패턴 매칭 시 대소문자를 명확하게 구분하고 싶다면 'BINARY' 키워드 사용. 
  * ex) ~ WHERE NAME LIKE BINARY '%el%'
