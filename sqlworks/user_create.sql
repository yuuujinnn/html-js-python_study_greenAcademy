SHOW USER;

-- 사용자 계정 만들기

-- DB이름, 비밀번호, 테이블 공간 생성
CREATE USER c##mydb IDENTIFIED BY mydb
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP;

-- 권한 설정
GRANT CONNECT, DBA TO c##mydb;