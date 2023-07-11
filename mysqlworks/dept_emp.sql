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

-- 부서 삭제(부서이름이 '디자인팀'을 삭제 -> 자식 로우(row)가 있으므로 삭제 안됨)
-- 제약 조건(on delete cascade)
delete from department where deptid = 20;

-- 부서 검색
select * from department;

-- 사원 검색
select * from employee;

-- 이름이 '한라산'인 사원의 ID와 사원 및 부서 ID를 검색하시오.alter
select empid, deptid from employee where empname= '한라산';

-- 부서 이름이 '개발팀'인 사무실의 위치를 검색하시오.
select location from department where deptname= '개발팀';

-- 사원 번호가 102인 사원의 이름을 '동해'로, 나이를 '30세'로 변경하시오.
-- update ~ set ~ where 구문
update employee set empname='동해', age= 30
where empid = 102;

-- 트랜 잭션(Transaction)-(실행-commit, 취소-rollback)
rollback;

commit;