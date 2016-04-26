T=int(raw_input())
while T>0:
    A,B,M=map(long,raw_input().split())
    r=len([x for x in range(A,B+1) if x%M==0])    
    print(r)
    T-=1
    
# print("Levou: "+str(decimal.Decimal(timeit.default_timer()-before)))
#     r= len(filter(lambda x: x%M==0,range(A,B)))
#     before=timeit.default_timer()
#     r= len(filter(lambda x: x%M==0,range(A,B)))
# import timeit
# import decimal