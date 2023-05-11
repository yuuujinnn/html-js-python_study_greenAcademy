-- GROUP BY의 ROLLUP(), CUBE()
-- 부서테이블(부서번호, 직업이름, 급여)
CREATE TABLE department(
    dept_no VARCHAR2(3),
    job_nm  VARCHAR2(30),
    salary  NUMBER(10)
);

-- 자료 삽입
INSERT INTO department VALUES ('100', '증권사', 3300000);
INSERT INTO department VALUES ('100', '관리자', 4300000);
INSERT INTO department VALUES ('200', '증권사', 5000000);
INSERT INTO department VALUES ('200', '데이터분석가', 4000000);
INSERT INTO department VALUES ('200', '관리자', 6000000);

SELECT * FROM department;

-- 부서별 급여 총계 구하기
SELECT dept_no,
       SUM(salary)
FROM department
GROUP BY dept_no;

-- 부서별 소계, 총계 : ROLLUP()
SELECT dept_no, job_nm,
       SUM(salary)
FROM department
GROUP BY ROLLUP(dept_no, job_nm)
ORDER BY dept_no;

-- 부서별, 직업별 소계, 총계 : CUBE()
SELECT dept_no, job_nm,
       SUM(salary)
FROM department
GROUP BY CUBE(dept_no, job_nm)
ORDER BY dept_no;

-- 부서별, 직업별 소계 : GROUPING SETS()
SELECT dept_no, job_nm,
       SUM(salary)
FROM department
GROUP BY GROUPING SETS(dept_no, job_nm)
ORDER BY dept_no;

