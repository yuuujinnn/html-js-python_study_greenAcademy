-- bookmall

SELECT * FROM book;
SELECT * FROM customer;
SELECT * FROM orders;

-- JOIN(동등조인-EQUI JOIN) - 공통된 부분(교집합, AND)
-- 고객의 이름과 고객이 주문에 도서의 판매가격을 구하시오
SELECT cus.name, ord.saleprice
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
ORDER BY cus.name;

-- '박지성' 고객이 주문한 도서의 판매가격을 구하시오
SELECT cus.name, ord.saleprice
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
   AND cus.name = '박지성';
   
-- 고객별로 주문한 모든 도서의 총 판매액을 구하시오(GROUB BY절, SUM()함수)
SELECT cus.name, SUM(ord.saleprice) 판매금액
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
GROUP BY cus.name;

-- '안산' 고객이 주문한 도서의 총 판매액을 구하시오(GROUB BY절, HAVING 구문)
SELECT cus.name, SUM(ord.saleprice) 판매금액
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
GROUP BY cus.name
HAVING cus.name = '안산';

-- 표준 SQL - INNER JOIN ON~
SELECT cus.name, ord.saleprice
FROM customer cus INNER JOIN orders ord
     ON cus.custid = ord.custid
     ORDER BY cus.name;

-- '박지성' 고객이 주문한 도서의 판매가격을 구하시오    
SELECT cus.name, ord.saleprice
FROM customer cus INNER JOIN orders ord
     ON cus.custid = ord.custid
WHERE cus.name = '박지성';
     
-- 3개의 테이블로 조인
-- 고객이 주문한 도서의 이름과 판매가격을 구하시오
SELECT cus.name, bk.bookname, ord.saleprice
FROM customer cus, orders ord, book bk
WHERE cus.custid = ord.custid
  AND bk.bookid = ord.bookid;

-- '박지성' 고객이 주문한 도서의 이름과 판매가격, 주문일을 구하시오
SELECT cus.name, bk.bookname, ord.saleprice, ord.orderdate
FROM customer cus, orders ord, book bk
WHERE cus.custid = ord.custid
  AND bk.bookid = ord.bookid
  AND cus.name = '박지성';
  
-- 외부 조인 ('+' 연산자 사용) : JOIN 조건에 충족하는 데이터가 아니어도 검색하는 방식
-- WHERE 절에서 모든 행이 출력되는 테이블의 반대편 테이블에 '+'를 붙임
-- 주문이 없는 고객을 포함하여 고객의 이름과 주문한 도서의 판매가격을 찾으시오
SELECT cus.name, ord.saleprice
FROM customer cus, orders ord
WHERE cus.custid = ord.custid(+)
ORDER BY cus.name;

-- 표준 SQL - LEFT OUTER JOIN ON ~
SELECT cus.name, ord.saleprice
FROM customer cus LEFT OUTER JOIN orders ord
    ON cus.custid = ord.custid
    ORDER BY cus.name;

