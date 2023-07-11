-- Members 프로젝트
use mydb;
-- 회원 테이블

create table t_member(
	memberid	varchar(20),
    passwd 		varchar(20) not null,
    name		varchar(30) not null, 
    gender		varchar(10),
    joindate 	timestamp default now(),
    primary key(memberid)
);

-- 게시판 테이블
create table t_board(
	bnum	int primary key auto_increment,
    title	varchar(100) not null,
    content text,
    regdate	timestamp default now(),
    modifydate timestamp,
    hit		int default 0,
    memberid varchar(20),
    fileupload varchar(50),
    constraint fk_member_board foreign key(memberid)
    references t_member(memberid) on delete cascade
);

-- 게시글 쓰기
insert into t_board(title, content, memberid)
values('가입인사', '안녕하세요. 가입했어요..', 'yujin');
insert into t_board(title, content, memberid)
values('가입인사', '안녕하세요. 가입했어요..', 'yujin');
insert into t_board(title, content, memberid)
values('가입인사', '안녕하세요. 가입했어요..', 'yujin');


-- 검색
select * from t_board;

-- limit(시작, 제한된 범위) : 시작하는 수에서 1을 더함,
-- 0~10 : 1page, 11-20 : 2page
select * from t_board order by bnum desc limit 0, 10;

commit;