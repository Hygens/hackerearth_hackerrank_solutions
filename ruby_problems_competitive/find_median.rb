a=[]
gets.to_i.times{
    a.push(gets.to_i)
    a=a.sort
    if a.size==1  
      p a[0].to_f
    elsif a.size==2  
      p a.inject(:+).to_f/2.to_f
    elsif a.size%2==0 
      k=a[(a.size/2)-1]+a[a.size/2]
      p k.to_f/2.to_f   
    else 
      p a[a.size/2].to_f 
    end         
}