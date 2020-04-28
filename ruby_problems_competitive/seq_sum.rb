#!/usr/bin/ruby
gets.to_i.times{
    n,k=gets.split.map(&:to_i)
    s=0
    n.times{|i| s=(i+1)**k+s}
    p s
}