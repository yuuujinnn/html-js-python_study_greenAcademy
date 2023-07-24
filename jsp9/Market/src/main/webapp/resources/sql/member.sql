use javaweb;

-- Market: member 테이블 생성
create table member(
	mid		varchar(20),
    passwd  varchar(20) not null,
    mname   varchar(30) not null,
    gender  varchar(10),
    birth   varchar(20),
    phone   varchar(20),
    email   varchar(30),
    address varchar(50),
    regdate timestamp default now(),
    primary key(mid)
);

insert into member(mid, passwd, mname, gender, birth, phone, email, address)
values('cloud', 'm123456#', '구름이', '여', '1995/12/1', '010/1234/5678', 
   'cloud@sky.com', '서울시 강남구 청담동');
   
commit;