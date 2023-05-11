
SELECT * FROM board ORDER BY bno DESC;

-- 작성자가 'admin'인 게시글
SELECT * FROM board 
WHERE writer = 'admin';

-- 인덱스 생성
CREATE INDEX idx_admin ON board(writer);

CREATE INDEX idx_title ON board(title);

-- 인덱스 삭제
DROP INDEX idx_admin;

-- 실행 계획 보는 코드
SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY_CURSOR(null, null, 'ALLSTATS LAST'));

