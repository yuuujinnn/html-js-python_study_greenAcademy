import oracledb

def getconn():
    conn = oracledb.connect(user='c##mydb', password='mydb',
                dsn='localhost:1521/xe')    # dsn - data source name
    return conn

# print(getconn())
def select():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM pytest"
    cursor.execute(sql)
    rs = cursor.fetchall()
    # print(rs)
    for i in rs:
        print(i)
    conn.close()

def insert():
    conn = getconn()
    cursor = conn.cursor()
    sql = "INSERT INTO pytest(message) VALUES ('행운을 빌어요')"
    cursor.execute(sql)
    conn.commit()
    conn.close()

insert()
select()