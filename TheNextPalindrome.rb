def next_palindrome 
  number = gets
  number ||= ''
  number = number.chomp!
  len = number.length
  if len == 1
    return "11\n" if number == "9"
    return number.next!<<"\n" 
  end
  if len.even?
    f = len/2   
    return number[0..f-1]<<number[0..f-1].reverse<<"\n" if number[0..f-1]>number[f..-1]
    number = number[0..f-1].next!
    return number<<number[0..f-1].reverse<<"\n"
  else
    f = (len-1)/2-1         
    return number[0..f+1]<<number[0..f].reverse<<"\n" if number[0..f]>number[f+2..-1] 
    number = number[0..f+1].next!       
    return number<<number[0..f].reverse<<"\n"
  end
end

def input
  tries = gets        # get input
  tries ||= ''        # set to empty string if nil
  tries = tries.chomp!        # remove trailing newline
  tries.to_i.times {print next_palindrome}      
end

input