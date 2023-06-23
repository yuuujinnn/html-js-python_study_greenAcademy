from django.contrib.auth.models import User
from django.db import models

from django.urls import reverse


#카테고리 모델
class Category(models.Model):
    #unique=True 중복 불허
    name = models.CharField(max_length=50, unique=True)
    #url주소 - 문자, allow_unicode - 한글 허용
    slug = models.SlugField(max_length=200, unique=True, allow_unicode=True)

    def __str__(self):
        return self.name

    #카테고리 url주소
    def get_absolute_url(self):
        return f'/blog/category/{self.slug}'

    #관리자 페이지에서 적용
    class Meta:
        ordering = ['name'] #이름순 정렬
        verbose_name = 'category'
        verbose_name_plural = 'categories'



#포스트 모델
class Post(models.Model):
    author = models.ForeignKey(User, on_delete=models.CASCADE)
    title = models.CharField(max_length=200) # 제목
    content = models.TextField()             #내용
    pub_date = models.DateTimeField()        #발행일
    modify_date = models.DateTimeField(null=True, blank=True) #입력 폼이 비어도 됨
    photo = models.ImageField(upload_to='blog/images/%Y/%m/%d/',
                              null=True, blank=True)
    category = models.ForeignKey(Category, null=True, blank=True, on_delete=models.SET_NULL) #카테고리가 삭제되어도

    def __str__(self):
        return self.title
