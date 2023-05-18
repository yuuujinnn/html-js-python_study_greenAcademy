select * from dept;
select * from employee;

INSERT INTO employee VALUES (100, '이강', 2500000, SYSDATE, '남자', '1000');
INSERT INTO employee VALUES (104, '이산', 2000000, SYSDATE, '여자', '1001');
INSERT INTO employee VALUES (105, '박달', 1500000, SYSDATE, '남자', '1002');

-- 사원이름 급여 성별 부서이름을 검색하시오(join)
select em.ename, em.sal, em.gender, de.deptname
    from dept de, employee em
    where de.deptno = em.deptno;

-- 사원이름 급여 성별 부서이름을 검색한 내용을 뷸호 작성.
-- create view 뷰이름 as select * from 테이블 이름
create view vw_dept_emp as
select em.ename, em.sal, em.gender, de.deptname
    from dept de, employee em
    where de.deptno = em.deptno;


select * from vw_dept_emp;

-- 모든 사원의 총 인원수를 구하시오

select count(*)total from vw_dept_emp;

-- 부서별 사원의 총 인원수를 구하시오
select deptname, count(*)total 
    from vw_dept_emp
    group by deptname;
    
-- 부서의 인원이 2명을 초과하는 자료를 검색하시오
select deptname, count(*)total 
    from vw_dept_emp
    group by deptname
    having count(*) >=2;
    
/*
실행순서
1. from 절
2. where 절
3. group by, having 절
4. select 절
5. order by 절
*/    