import sqlite3

def getconn():
    conn = sqlite3.connect("c:/green_project/sqlworks/pydb/memberdb.db")
    return conn
print(getconn())

def select():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM member"
    cursor.execute(sql)     # 검색 수행
    rs = cursor.fetchall()
    print(rs)
    for i in rs:
        print(i)
    conn.close()

def insert():
    conn = getconn()
    cursor = conn.cursor()
    # 동적 바인딩
    sql = "INSERT INTO member(memberid, passwd, name, gender) " \
          "VALUES (?, ?, ?, ?);"
    cursor.execute(sql, ('today123', 'm123456$', '투데이', '여'))  # 검색 수행
    conn.commit()  # 커밋 완료
    conn.close()

def select_one():
    conn = getconn()
    cursor = conn.cursor()
    # 동적 바인딩
    sql = "SELECT * FROM member WHERE memberid = ? AND passwd = ?"
    cursor.execute(sql, ('test', 'test1234'))
    rs = cursor.fetchone()
    print(rs)
    conn.close()


# insert()
# select()

select_one()