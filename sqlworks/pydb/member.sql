-- member 테이블
CREATE TABLE member(
   memberid text PRIMARY key,
   passwd text not null,
   name text not null,
   gender text,
   regdate datetime default (datetime('now', 'localtime'))
);

-- 회원 추가
INSERT INTO member(memberid, passwd, name, gender)
VALUES ('cloud123', 'm123456#', '장그래', '남');

-- 회원 추가
INSERT INTO member(memberid, passwd, name, gender)
VALUES ('cloud345', 'm123456#', '오대리', '여');

SELECT * FROM member;

