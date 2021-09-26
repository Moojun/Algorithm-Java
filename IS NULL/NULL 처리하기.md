## NULL 처리하기
문제 출처 : Programmers  

풀이 답안 : MYSQL  

```sql
SELECT ANIMAL_TYPE, COALESCE(NAME, 'No name'), SEX_UPON_INTAKE
FROM ANIMAL_INS;
```
```sql
SELECT ANIMAL_TYPE, IFNULL(NAME, 'No name'), SEX_UPON_INTAKE
FROM ANIMAL_INS;
```
```sql
SELECT ANIMAL_TYPE, IF(NAME IS NOT NULL, NAME, 'No name'), SEX_UPON_INTAKE
FROM ANIMAL_INS;
```
```sql
SELECT ANIMAL_TYPE, 
CASE 
    WHEN NAME IS NOT NULL THEN NAME
    ELSE 'No name'
END,
SEX_UPON_INTAKE
FROM ANIMAL_INS;
```
---
1. COALESCE 함수(표준 SQL 함수) : COALESCE 함수는 괄호 속 인자 중에서 가장 첫 번째로 NULL이 아닌 값을 반환한다.
2. IFNULL 함수(MYSQL 함수) : IFNULL 함수는 첫 번째 인자가 NULL인 경우에는, 두 번째 인자를 표시하고 NULL이 아니면 해당 값을 그대로 표현한다.
3. IF 함수는 가장 첫 번째 인자로 어떤 조건식이 옵니다. 만약 그 조건식의 결과가 True라면 두 번째 인자를 리턴하고, False라면 세 번째 인자를 리턴한다.
4. CASE 함수
