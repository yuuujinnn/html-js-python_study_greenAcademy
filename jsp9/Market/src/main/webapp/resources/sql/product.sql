-- user : jweb인 계정 생성
create user jweb@localhost identified by 'jweb';
-- db 생성
create database javaweb;
-- db 권한 주기
grant all privileges on javaweb.* to jweb@localhost with grant option;


-- Product 테이블 생성
CREATE TABLE product(
	p_id	VARCHAR(10) PRIMARY KEY,
    p_name  VARCHAR(30),
    p_unitPrice INTEGER,
    p_description TEXT,
    p_category  VARCHAR(20),
    p_manufacturer VARCHAR(20),
    p_unitsInStock LONG,
    p_condition VARCHAR(20),
    p_productImage VARCHAR(20)
);

-- 상품 추가
INSERT INTO product VALUES ('P1234', 'iPhone 6s', 1200000, '1334X750 Renia HD Display',
			'Smart Phone', 'Apple', 1000, 'New', 'P1234.png');