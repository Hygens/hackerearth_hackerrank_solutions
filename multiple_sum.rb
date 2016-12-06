#!/usr/bin/ruby
N,A,B=gets.split.map(&:to_i);sum=0
(A..N-1).each  do |n| sum+=(n%A==0 or n%B==0)?n:0 end
p sum
