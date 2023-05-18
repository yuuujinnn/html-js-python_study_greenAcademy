-- GROUP  BY의 ROLLUP(), CUBE()
-- 부서 테이블(부서번호, 직업이름, 급여)
create table department(
    dept_no varchar2(3),
    job_nm varchar2(30),
    salary number(10)
);
-- 자료삽입
insert into department values('100','증권사','3300000');
insert into department values('100','관리자','4300000');
insert into department values('200','증권사','5000000');
insert into department values('200','데이터분석가','4000000');
insert into department values('200','관리자','6000000');

select * from department;

-- 부서별 급여 총계 구하기
select dept_no,
    sum(salary)급여총계
    from department
    group by dept_no;

-- 부서별 소계와 총계
select dept_no, job_nm
    , sum(salary)급여총계 
    from department
    group by rollup(dept_no,job_nm)
    order by dept_no;
   
select dept_no, job_nm
    , sum(salary)급여총계 
    from department
    group by CUBE(dept_no,job_nm)
    order by dept_no;    
-- 부서별, 직업별 소계 : grouping sets 
select dept_no, job_nm
    , sum(salary)급여총계 
    from department
    group by grouping sets(dept_no,job_nm)
    order by dept_no;      
    

