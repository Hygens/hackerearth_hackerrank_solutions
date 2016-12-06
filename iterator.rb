# > skip_animals(['leopard', 'bear', 'fox', 'wolf'], 2)
# => ["2:fox", "3:wolf"]


def skip_animals(animals, skip)
    my_arr=Array.new
    animals.each_with_index do |item,index| 
            if index>=skip
              my_arr.push("#{index}:#{item}") 
            end
    end
    return my_arr     
end
arr =  ['leopard', 'bear', 'fox', 'wolf']
rarr = skip_animals(arr,2)
puts rarr

