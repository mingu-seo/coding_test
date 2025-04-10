n = int(input())

arr = []
arr.append(' @@@   @@@  ')
arr.append('@   @ @   @ ')
arr.append('@    @    @ ')
arr.append('@         @ ')
arr.append(' @       @  ')
arr.append('  @     @   ')
arr.append('   @   @    ')
arr.append('    @ @     ')
arr.append('     @      ')


for i in range(len(arr)) :
    for _ in range(n) :
        print(arr[i], end='')
    print()