from django.shortcuts import render, redirect
from django.utils import timezone

from blog.forms import PostForm
from blog.models import Post


def index(request):
    return render(request, 'blog/index.html')

def post_list(request):
    post_list = Post.objects.all()
    context = {'post_list': post_list}
    return render(request, 'blog/post_list.html', context)

# 상세페이지
def detail(request, post_id):
    post = Post.objects.get(id=post_id)
    context = {'post': post}
    return render(request, 'blog/detail.html', context)

# 글쓰기
def post_create(request):
    if request.method == "POST":
        form = PostForm(request.POST, request.FILES) # (일반속성, 파일)
        if form.is_valid(): #유효하다면
            post = form.save(commit=False)
            post.pub_date = timezone.now() #현재 시간
            post.save()
            return redirect('blog:post_list')
    else:
        form = PostForm() #비어있는 폼
    context = {'form': form}
    return render(request, 'blog/post_form.html', context)