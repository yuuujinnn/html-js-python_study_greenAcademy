from django.contrib import admin

from blog.models import Post

# 관리자 페이지에 Post를 등록
admin.site.register(Post)