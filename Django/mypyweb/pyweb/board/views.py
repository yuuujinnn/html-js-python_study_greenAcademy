from django.http import HttpResponse
from django.shortcuts import render

from board.models import Question


def index(request):
    return render(request, "board/index.html")
    # return HttpResponse("<h1>웹 메인 페이지 입니다.</h1>")

def question_list(request):
    question_list = Question.objects.all()
    context = { 'question_list': question_list }
    return render(request, 'board/question_list.html', context)

def detail(request, question_id):
    question = Question.objects.get(id=question_id)
    context = {'question' : question}
    return render(request, 'board/detail.html', context)