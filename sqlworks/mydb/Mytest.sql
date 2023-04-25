-- Mytest
CREATE TABLE Mytest(
    class   VARCHAR2(1),
    name    VARCHAR2(6)
);

INSERT INTO Mytest VALUES ('A', '조조');
INSERT INTO Mytest VALUES ('A', '조조');
INSERT INTO Mytest VALUES ('A', '조조');
INSERT INTO Mytest VALUES ('B', '유비');
INSERT INTO Mytest VALUES ('B', '관우');
INSERT INTO Mytest VALUES ('C', '여포');
INSERT INTO Mytest VALUES ('C', '여포');

-- 검색
SELECT * FROM Mytest;


-- 반별, 학생별 학생수를 구하시오
SELECT class, COUNT(NAME) 학생수
FROM Mytest
GROUP BY class;

-- 이름 - 중복 제거
SELECT class, COUNT(DISTINCT NAME) RESULT2
FROM Mytest
GROUP BY class;


-- CASE WHEN
/* 
CASE
    WHEN 조건 1 THEN 값 1
    WHEN 조건 2 THEN 값 2
    ELSE 값 3
    END
*/ 

SELECT
    COUNT(CASE WHEN class = 'A' THEN 1
        END) AS A,
    COUNT(CASE WHEN class = 'B' THEN 1
        END) AS B,
    COUNT(CASE WHEN class = 'C' THEN 1
        END) AS C
FROM Mytest;


-- DECODE(칼럼, 조건, 참인값, 거짓인값)
SELECT
    COUNT(DECODE(class, 'A', 1)) AS A,
    COUNT(DECODE(class, 'B', 1)) AS B,
    COUNT(DECODE(class, 'C', 1)) AS C
FROM Mytest;


