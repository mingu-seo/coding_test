value = input()
t = {'fdsajkl;':'in-out', 'jkl;fdsa':'in-out', 'asdf;lkj':'out-in', ';lkjasdf':'out-in', 'asdfjkl;':'stairs', ';lkjfdsa':'reverse'}

if t.get(value) :
    print(t.get(value))
else :
    print('molu')