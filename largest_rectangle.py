import sys
def maxArea(hist,n):
    stack = [] 
    max_area = 0
    tp=0
    area_with_top=0
    i = 0
    while i < n:    
        if (not stack or hist[stack[-1]] <= hist[i]):
            stack.append(i) 
            i+=1                             
        else:
            tp = stack.pop()
            if not stack:
                area_with_top = hist[tp]*i 
            else: 
                area_with_top = hist[tp]*(i-(stack[-1])-1)           
            if max_area < area_with_top:
                max_area = area_with_top        
    while stack:
        tp = stack.pop()
        if not stack:
            area_with_top = hist[tp]*i 
        else: 
            area_with_top = hist[tp]*(i-(stack[-1])-1) 
        if max_area < area_with_top:
            max_area = area_with_top
    return max_area    
n=int(sys.stdin.readline().strip())
b=map(int,sys.stdin.readline().strip().split(' '))
print(maxArea(b,n))

    
    
