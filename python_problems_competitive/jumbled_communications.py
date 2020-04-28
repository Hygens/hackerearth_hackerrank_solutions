def reverse_left_xor(value, shift):
    output, i = 0, 0
    size = len(bin(value)[2:])
    mult = int(size*'1',2)
    while i * shift < size:
        compartment = int(bin((size >> (shift)) << (shift * i))[-size:].replace('b',''), 2)
        part_output = value & compartment
        value ^= part_output << shift & mult
        output |= part_output
        i += 1
    return output

n = int(input().strip())
for x in map(int,input().split(' ')):
    print(reverse_left_xor(x,1),end=' ')  
    
    


      
    

    