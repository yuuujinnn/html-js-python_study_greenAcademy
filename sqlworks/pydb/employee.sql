CREATE TABLE employee(
	empid	CHAR(10) PRIMARY KEY,
	name	TEXT NOT NULL,
	age		INTEGER,
	salary 	INTEGER
);

-- 사원 추가
INSERT INTO employee VALUES ('e101', '추신수', 41, 20000);
INSERT INTO employee VALUES ('e102', '김하성', 28, 15000);

SELECT * FROM employee;

-- 사원 번호가 'e102'인 사원을 검색하시오
SELECT * FROM employee WHERE empid = 'e102';

-- 급여가 20000 이상인 사원을 검색하시오
SELECT * FROM employee WHERE salary >= 20000;

-- 추신수의 나이를 40으로 변경하시오
UPDATE employee SETage = 40 WHERE empid = 'e101';

COMMIT;