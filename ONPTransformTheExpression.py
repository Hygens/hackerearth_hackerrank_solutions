import sys
LEFT_ASSOC = 0
RIGHT_ASSOC = 1
OPERATORS = {
    '+' : (0, LEFT_ASSOC),
    '-' : (0, LEFT_ASSOC),
    '*' : (5, LEFT_ASSOC),
    '/' : (5, LEFT_ASSOC),
    '%' : (5, LEFT_ASSOC),
    '^' : (10, RIGHT_ASSOC)
}
def isOperator(token):
    return token in OPERATORS.keys()
def isAssociative(token, assoc):
    if not isOperator(token):
        raise ValueError('Invalid token: %s' % token)
    return OPERATORS[token][1] == assoc
def cmpPrecedence(token1, token2):
    if not isOperator(token1) or not isOperator(token2):
        raise ValueError('Invalid tokens: %s %s' % (token1, token2))
    return OPERATORS[token1][0] - OPERATORS[token2][0]
def infixToRPN(tokens):
    out = []
    stack = []    
    for token in tokens:
        if isOperator(token):            
            while len(stack) != 0 and isOperator(stack[-1]):               
                if (isAssociative(token, LEFT_ASSOC) and cmpPrecedence(token, stack[-1]) <= 0) or (isAssociative(token, RIGHT_ASSOC)
                    and cmpPrecedence(token, stack[-1]) < 0):                    
                    out.append(stack.pop())
                    continue
                break            
            stack.append(token)
        elif token == '(':
            stack.append(token) 
        elif token == ')':            
            while len(stack) != 0 and stack[-1] != '(':
                out.append(stack.pop()) 
            stack.pop() 
        else:
            out.append(token) 
    while len(stack) != 0:        
        out.append(stack.pop())
    return out
if __name__ == '__main__':
    n = int(sys.stdin.readline().strip())
    while n>0:
        entry = list(sys.stdin.readline().strip())
        output = infixToRPN(entry)
        print ''.join(output)
        n-=1
        