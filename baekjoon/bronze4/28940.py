w, h = map(int, input().split())
n, a, b = map(int, input().split())

if a > w or b > h : 
    print(-1)
else : 
    countPerPage = (w//a)*(h//b)

    page = n // countPerPage
    if n % countPerPage > 0 : page += 1
    print(page)