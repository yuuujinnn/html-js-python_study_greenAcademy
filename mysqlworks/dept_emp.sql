-- 부서와 사원 테이블 만들기
use mydb;

-- 부서 테이블
create table department(
	deptid int primary key,
    deptname varchar(30) not null,
    location varchar(20) not null
);

-- 사원 테이블
create table employee(
	empid int primary key,
    empname varchar(30) not null,
    age int,
    deptid int not null,
    constraint fk_dept_employee foreign key(deptid)
    references department(deptid)  -- 관계 설정(외래키)
);

-- 부서 추가
insert into department values(10, '개발팀', '서울');
insert into department values(20, '디자인팀', '성남');

-- 사원 추가
insert into employee values(101, '한라산', 27, 10);
insert into employee values(102, '동해', 30, 20);
insert into employee values(103, '서해', 23, 30); -- 부모키가 없음(제약 위배)


-- 부서 검색
select * from department;

-- 사원 검색
select * from employee;