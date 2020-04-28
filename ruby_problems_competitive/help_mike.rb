#!/usr/bin/ruby
gets.to_i.times{
    n,k=gets.split.map(&:to_i)
    _A= (1..n).step(1).to_a.combination(2).select do |i,j|
              (i < j && (i + j) % k == 0)
        end
    p _A.size
}