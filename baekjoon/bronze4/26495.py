arr = []
arr.append('''0000
0  0
0  0
0  0
0000''')
arr.append('''   1
   1
   1
   1
   1''')
arr.append('''2222
   2
2222
2
2222''')
arr.append('''3333
   3
3333
   3
3333''')
arr.append('''4  4
4  4
4444
   4
   4''')
arr.append('''5555
5
5555
   5
5555''')
arr.append('''6666
6
6666
6  6
6666''')
arr.append('''7777
   7
   7
   7
   7''')
arr.append('''8888
8  8
8888
8  8
8888''')
arr.append('''9999
9  9
9999
   9
   9''')

val = input()
for v in val :
    print(arr[int(v)])
    print()