-- 옵티마이저 - sql 최적화
SELECT * FROM board;

-- 작성자가 'admin'인 게시글 조회
SELECT * FROM board 
WHERE writer = 'admin';

-- 작성자가 'admin'인 게시글 조회 - 인덱스로 만들기
-- CREATE INDEX 인덱스이름 ON 테이블이름(칼럼이름)
CREATE INDEX idx_writer ON board(writer);

-- 오라클 힌트
-- /*+ INDEX(테이블이름 인덱스이름) */
SELECT /*+ INDEX(board idx_writer) */ * FROM board
WHERE writer = 'admin';

-- 실행 계획 보는 코드
SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY_CURSOR(null, null, 'ALLSTATS LAST'));