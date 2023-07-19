use mydb;

-- jdbc 테스트용 user 테이블 생성
create table user(
	id		int primary key,
    pwd		varchar(20) not null,
    name	varchar(30) not null,
    phone	varchar(20)
);
