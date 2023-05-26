-- java 연동 테이블 생성
CREATE TABLE person(
    userid VARCHAR2(10) PRIMARY KEY,
    userpw VARCHAR2(10) NOT NULL,
    name   VARCHAR2(20) NOT NULL,
    age    NUMBER(3)
);

INSERT INTO person(userid, userpw, name, age)
VALUES ('cloud', 'cloud123', '구름이', 120);

INSERT INTO person(userid, userpw, name, age)
VALUES ('today', 'today123', '투데이', 5);

SELECT * FROM person;

COMMIT;