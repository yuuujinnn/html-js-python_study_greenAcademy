-- user 계정
show databases;  /* db 보기 */

use mysql;  /* db 사용 */
show tables; /* 테이블 보기 */

-- db 생성
create database mydb;

-- db 권한주기
grant all privileges on mydb.* to root@localhost with grant option;

show databases;
