-- bookmall 관련 테이블
SELECT * FROM book;
SELECT * FROM customer;
SELECT * FROM orders;

-- 고객이 주문한 도서의 총 판매액 구하기
SELECT SUM(saleprice) 총판매액 
FROM orders;

-- 고객별, 도서별 총판매액 계산
SELECT custid,
       bookid,
       SUM(saleprice) 총판매액 
FROM orders
GROUP BY custid, bookid;

-- 고객별 총판매액 계산, 소계, 총계 구하기
-- ROLLUP() : 부서별 소계, 총계
SELECT custid, bookid,
       SUM(saleprice) 총판매액 
FROM orders
GROUP BY ROLLUP(custid, bookid)
ORDER BY custid;

-- CUBE() : 부서별, 도서별 소계 및 총계
SELECT custid, bookid,
       SUM(saleprice) 총판매액 
FROM orders
GROUP BY CUBE(custid, bookid)
ORDER BY custid;

-- GROUPING SETS() : 고객별, 도서별 소계
SELECT custid, bookid,
       SUM(saleprice) 총판매액 
FROM orders
GROUP BY GROUPING SETS(custid, bookid)
ORDER BY custid, bookid;




