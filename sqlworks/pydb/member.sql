--member 테이블
CREATE TABLE member(
	memberid  TEXT PRIMARY KEY,
	passwd  TEXT NOT NULL,
	name  TEXT NOT NULL,
	gender TEXT,
	regdate DATETIME DEFAULT (datetime('now', 'localtime'))
);

-- 회원 추가
INSERT INTO member(memberid, passwd, name, gender) 
VALUES ('cloud123', 'm123456#', '장그래', '남');

SELECT * FROM member;