n = int(input().strip()) ; [print('%d%s' %(v-k,'\n' if k==n-1 else ' '), end='') for k,v in enumerate(sorted([int(x) for x in input().split(' ')]))]

    

