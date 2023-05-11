from flask import Flask, render_template, request

app = Flask(__name__)  #app 객체 생성

@app.route('/')
def index():
    return render_template('index.html')   # html 페이지 보내기

@app.route('/season')
def get_season():
    season = '봄'
    seasonlist = ['봄', '여름', '가을', '겨울']
    return render_template(
        'season.html',
        season = season,
        seasons = seasonlist
    )
# request(요청) - GET 방식(생략 가능)
@app.route('/loopindex', methods = ['GET'])
def loopindex():
    items = ['a', 'b', 'c', 'd']
    return render_template('loopindex.html', items=items)

# 짝수/홀수 판정 페이지
@app.route('/even_odd', methods = ['GET', 'POST'])
def even_odd():
    # 예외 처리 한 경우
    if request.method == "POST":
        try:
           num = int(request.form['num'])
        except ValueError:
            error_message = "숫자를 입력해주세요"
            return render_template('even_odd.html', error_msg = error_message)
        else:
            if num % 2 == 0:
                result = "짝수입니다."
            else:
                result = "홀수입니다."
                # 결과 페이지로 보냄
            return render_template('calc_result.html',
                                   num=num, result=result)
    else:
        return render_template('even_odd.html')

    """
    #예외 처리하지 않은 경우
    if request.method == "POST":
       num = int(request.form['num'])   # 데이터 가져오기(문자형->숫자형)
       if num % 2 == 0:
           result = "짝수입니다."
       else:
           result = "홀수입니다."
       # 결과 페이지로 보냄
       return render_template('calc_result.html',
                num=num, result=result)
    else:  #request.method == "GET"
        return render_template('even_odd.html')
    """

# 회원 가입 페이지
@app.route('/register', methods = ['GET', 'POST'])
def register():
    if request.method == "POST":
        # 데이터 가져오기(넘겨 받기) - name 속성
        mid = request.form['memberid']
        pwd = request.form['passwd']
        name = request.form['name']
        gender = request.form['gender']
        return render_template('memberlist.html',
                mid=mid, pwd=pwd, name=name, gender=gender)
    else:
        return render_template('register.html')

app.run()