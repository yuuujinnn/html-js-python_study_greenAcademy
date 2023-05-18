SELECT * FROM tbl_class;
SELECT * FROM tbl_student;

-- 조인
SELECT stu.sname, stu.age, stu.gender, cls.cid, cls.cname
FROM tbl_class cls, tbl_student stu
WHERE cls.cid = stu.cid;

-- 학과별 학생수를 구하시오
SELECT cls.cid, COUNT(*) 학생수
FROM tbl_class cls, tbl_student stu
WHERE cls.cid = stu.cid
GROUP BY cls.cid, cls.cname;

-- 학과별 학생수의 소계 및 총계를 구하시오
SELECT cls.cid, cls.cname, COUNT(*) 학생수
FROM tbl_class cls, tbl_student stu
WHERE cls.cid = stu.cid
GROUP BY ROLLUP(cls.cid, cls.cname);

