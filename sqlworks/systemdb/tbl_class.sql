
-- 학과 테이블
CREATE TABLE tbl_class(
    cid  NUMBER(3),                --학과코드(기본키)
    cname VARCHAR2(30) NOT NULL,   --학과명
    ctel  VARCHAR2(15) NOT NULL,   --학과 전화번호
    clocation VARCHAR2(20) NOT NULL,        --과사무실 위치
    PRIMARY KEY(cid)
);

-- 학과 자료 삽입
INSERT INTO tbl_class VALUES (101, '소프트웨어학과', '02-1234-1234', 'B동 3층');
INSERT INTO tbl_class VALUES (102, '화학공학과', '02-1234-4567', 'B동 4층');
INSERT INTO tbl_class VALUES (103, '전기전자공학과', '02-1234-5678', 'B동 5층');

SELECT * FROM tbl_class;