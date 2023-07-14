-- 게시판 테이블
create table t_board(
	bnum	int primary key auto_increment,  --게시글 번호
    title	varchar(100) not null,           --글제목
    content text,                            --글내용
    regdate timestamp default now(),         --작성일
    modifydate timestamp,                    --수정일
    hit		int default 0,                   --조회수
    memberid varchar(20),                    --회원 아이디(외래키)
    fileupload varchar(50),                  --파일업로드
    constraint fk_member_board foreign key(memberid)  --외래키
    references t_member(memberid) on delete cascade
);

-- 댓글 테이블
create table t_reply(
	rno	int primary key auto_increment,  -- 댓글 번호
    bnum int not null,                   -- 게시글 번호(외래키)
    rcontent text not null,              -- 댓글 내용
    replyer varchar(30) not null,        -- 작성자
    rdate timestamp default now(),       -- 작성일
    rupdate timestamp,                   -- 수정일
	constraint fk_reply_board foreign key(bnum)  -- 외래키 제약조건
    references t_board(bnum) on delete cascade
);