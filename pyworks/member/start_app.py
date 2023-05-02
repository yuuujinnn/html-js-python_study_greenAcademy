# 컨트롤러 start_app.py
# templates 폴더, static 폴더
# 웹 서버 - flask
import sqlite3

from flask import Flask, render_template, request, redirect, url_for,session

app = Flask(__name__)

app.secret_key = "asdfqqewr1234%#@"

# sqlite3와 연동 - 연결 객체 생성
def getconn():
    conn = sqlite3.connect("c:/green_project/sqlworks/pydb/memberdb.db")
    return conn
print(getconn())

# url - '/' 경로 설정
@app.route('/', methods = ['GET'])
def index():
    return render_template('index.html')

# 회원 목록
@app.route('/memberlist', methods = ['GET'])
def memberlist():
    conn = getconn()
    cursor = conn.cursor()
    # 동적 바인딩
    sql = "SELECT * FROM member"
    cursor.execute(sql)  # 검색 수행
    rs = cursor.fetchall()
    conn.close()

    return render_template('memberlist.html', rs = rs)

# 회원 가입
@app.route('/register', methods = ['GET', 'POST'])
def register():
    if request.method == 'POST':
        # 가입 폼에 입력된 자료 넘겨 받음
        id = request.form['memberid']
        pw = request.form['passwd1']
        name = request.form['name']
        gender = request.form['gender']

        #db에 저장
        conn = getconn()
        cursor = conn.cursor()
        sql = f"INSERT INTO member(memberid, passwd, name, gender) " \
              f"VALUES ('{id}', '{pw}', '{name}', '{gender}');"
        cursor.execute(sql)  # 검색 수행
        conn.commit()  # 커밋 완료
        conn.close()

        # redirect - 회원가입후 회원 목록 페이지로 강제로 이동
        return redirect(url_for('memberlist'))
    else:
        return render_template('register.html')

# 로그인 페이지
@app.route('/login', methods = ['GET', 'POST'])
def login():
    if request.method == "POST":
        # 로그인폼에 입력된 데이터를 넘겨 받음
        id = request.form['memberid']
        pw = request.form['passwd']

        #database에 접속
        conn = getconn()
        cursor = conn.cursor()
        # 동적 바인딩
        sql = f"SELECT * FROM member " \
              f"WHERE memberid = '{id}' AND passwd = '{pw}'"
        cursor.execute(sql)
        rs = cursor.fetchone()
        print(rs)
        conn.close()
        
        if rs:  # rs = True
            session['userid'] = rs[0]   # memberid를 세션에 저장(세션 발급)
            return redirect(url_for('index'))
        else:
            error_msg = "아이디나 비밀번호를 확인해주세요"
            return render_template('login.html', error_msg=error_msg)

    else:
        return render_template('login.html')

@app.route('/logout')
def logout():
    session.clear() # 모든 세션 삭제
    return redirect(url_for('index'))
app.run()