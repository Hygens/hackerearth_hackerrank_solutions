#!/usr/bin/ruby
def rotate(matrix,r)
  r.times{ matrix.replace(matrix.reverse.transpose) }
    return matrix
end
m,n,r=gets.split.map(&:to_i)
a=[]
b=[]
m.times{
    b=gets.split.map(&:to_i)
    a.push(b)    
}
p rotate(a,r)