SELECT * FROM dept;
SELECT * FROM employee;

INSERT INTO employee VALUES (100, '이강', 2500000, SYSDATE, '남자', '1001');
INSERT INTO employee VALUES (104, '이달', 2000000, SYSDATE, '여자', '1001');
INSERT INTO employee VALUES (105, '한달', 1500000, SYSDATE, '남자', '1002');

-- 사원이름, 급여, 성별, 부서이름을 검색하시오(JOIN)
SELECT em.ename, em.sal, em.gender, de.deptname
FROM dept de, employee em
WHERE de.deptno = em.deptno;

-- 사원이름, 급여, 성별, 부서이름을 검색한 내요을 뷰로 작성.
-- CREATE VIEW 뷰이름 AS SELECT * FROM 테이블이름
CREATE VIEW vw_dept_emp AS
SELECT em.ename, em.sal, em.gender, de.deptname
FROM dept de, employee em
WHERE de.deptno = em.deptno;

SELECT * FROM vw_dept_emp;

-- 모든 사원의 총인원수를 구하시오
SELECT COUNT(*) total
FROM vw_dept_emp;

-- 부서별 사원의 총인원수를 구하시오
SELECT deptname, COUNT(*) total
FROM vw_dept_emp
GROUP BY deptname;

-- 부서의 인원이 2명을 초과하는 자료를 검색하시오
SELECT deptname, COUNT(*) total
FROM vw_dept_emp

GROUP BY deptname
--HAVING COUNT(*) > 2;
HAVING total > 2;

/*실행순서
 1. FROM절
 2. WHERE 절
 3. GROUP BY, HAVING
 4. SELECT 절
 5. ORDER BY
*/





