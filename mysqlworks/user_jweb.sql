
-- user : jweb인 계정 생성
create user jweb@localhost identified by 'jweb';

-- db 생성
create database javaweb;

-- db 권한 주기
grant all privileges on javaweb.* to jweb@localhost with grant option;