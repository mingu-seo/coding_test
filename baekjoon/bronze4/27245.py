# 길이와 너비 중 짧은 쪽의 높이에 대한 비율이 최소한 2, 그리고 길이와 너비 중 긴 쪽과 짧은 쪽의 비율은 다음을 초과하지 않습니다. 2.
w = int(input())
l = int(input())
h = int(input())

if min(w,l) / h >= 2 and max(w,l) / min(w,l) <= 2 :
    print('good')
else :
    print('bad')