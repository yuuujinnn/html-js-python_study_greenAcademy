--
SELECT *
FROM employee;

-- 부서별 급여 총액이 500만원 이상인 자료 검색
SELECT deptno, SUM(sal)
FROM employee
GROUP BY deptno
HAVING SUM(sal) > 5000000;

-- 부서별 급여 소계와 총계
SELECT deptno, SUM(sal)
FROM employee
GROUP BY ROLLUP(deptno);

-- 급여 누적값 계산
-- SUM(칼럼명) OVER(ORDER BY 칼럼명)
SELECT empno,
       ename,
       sal,
       SUM(sal) OVER(ORDER BY empno) "sal_sum",  -- 오름차순 누적
       SUM(sal) OVER(ORDER BY empno  -- 오름차순 누적 (이전행과 현재형 더하기)
            ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) "sal_sum2",
       SUM(sal) OVER(ORDER BY empno  -- 내림차순 누적 (현재행과 다음행 더하기
            ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) "sal_sum2"
FROM employee;