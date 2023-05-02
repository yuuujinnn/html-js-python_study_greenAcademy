-- tcl_test 테이블 생성
CREATE TABLE tcl_test(
    cl NUMBER(2),
    c2 NUMBER(3)
);

SAVEPOINT t1;
INSERT INTO tcl_test VALUES(10, 100);

SAVEPOINT t2;
INSERT INTO tcl_test VALUES(20, 200);

ROLLBACK TO t2; -- t2 ROLLBACK(취소)

COMMIT; --커밋 완료

SELECT * FROM tcl_test;