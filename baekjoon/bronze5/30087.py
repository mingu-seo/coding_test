seminar = {'Algorithm':'204', 'DataAnalysis':'207', 'ArtificialIntelligence':'302', 'CyberSecurity':'B101', 'Network':'303', 'Startup':'501', 'TestStrategy':'105'}
arr = []
N = int(input())
for _ in range(N) :
    arr.append(input())
for a in arr :
    print(seminar[a])
