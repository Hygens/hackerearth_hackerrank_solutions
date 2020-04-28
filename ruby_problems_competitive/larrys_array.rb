#!/usr/bin/ruby
def sorted? arr
  arr == arr.sort
end
gets.to_i.times{
    b=gets.split.map(&:to_i)
    a.push(b)    
}
p rotate(a,r)