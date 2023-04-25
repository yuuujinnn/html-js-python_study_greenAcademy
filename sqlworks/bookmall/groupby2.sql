-- bookmall 관련
select * from book;
select * from customer;
select * from orders;

-- 고객이 주문한 도서의 총 판매액 구하기

select sum(salprice) 총판매액 
from orders;

select custid,
        bookid,
    sum(salprice) 총판매액
    from orders
    group by custid, bookid;
    
-- 고객별 총판매액 계산, 소계, 총계 구하기
-- rollup(), cube()
select custid,
        bookid,
    sum(salprice)총판매액
    from orders
    group by rollup(custid,bookid)
    order by custid;
-- cube()    
select custid,
        bookid,
    sum(salprice)총판매액
    from orders
    group by cube(custid,bookid)
    order by custid,bookid;
-- grouping sets    
select custid,
        bookid,
    sum(salprice)총판매액
    from orders
    group by grouping sets(custid,bookid)
    order by custid,bookid;    