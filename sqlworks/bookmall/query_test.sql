-- 연습 문제
--1. 2.
select name, address, address from customer;
--3.
select * from customer
where address not like '%영국%';
--4. 
select * from customer
where name in ('김연아', '안산');
--5.
select * from customer
where address not like '대한민국%';
--6.
select * from customer
where phone is null;
--7
select * from customer order by name;
--8.
select count(*) 총인원수 from customer;

