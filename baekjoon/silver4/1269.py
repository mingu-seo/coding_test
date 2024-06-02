'''
대칭 차집합
'''
A, B = (int(i) for i in input().split())
arr1 = [int(i) for i in input().split()]
arr2 = [int(i) for i in input().split()]

arr1 = set(arr1)
arr2 = set(arr2)

a1 = arr1.difference(arr2)
a2 = arr2.difference(arr1)

print(len(a1)+len(a2))