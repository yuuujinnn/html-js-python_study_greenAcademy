
SELECT * FROM board ORDER BY bno DESC;

-- �ۼ��ڰ� 'admin'�� �Խñ�
SELECT * FROM board
WHERE writer = 'admin';

-- �ε��� ����
CREATE INDEX idx_admin ON board(writer);

-- �ε��� ����
DROP INDEX idx_admin;

-- 실행 계획 보는 코드
SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY_CURSOR(null, null, 'ALLSTATS LAST'));