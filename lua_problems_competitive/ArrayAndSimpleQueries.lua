-- Convert standard input list
local function input()
  t = {}
  s = io.read():gmatch("%S+") 
  for w in s do table.insert(t,w) end
  return t
end
local function rangeRemoveInsert(t,i,n,l)
    if l=='head' then
      k=1
      for j = i,i+n do 
        table.insert(t,k,table.remove(t,j)) 
        k = k + 1
      end    
    else 
      for j = i,i+n do table.insert(t,table.remove(t,i)) end
    end
    return t
end
local function intercall_table_sep(s,sep)
  return table.concat(s,sep)
end
n,m=table.unpack(input()) 
a=input()
l={}
for x = 1,m do
  qu,i,j = table.unpack(input())
  if qu=='1' then a=rangeRemoveInsert(a,i,j-i,'head') end    
  if qu=='2' then a=rangeRemoveInsert(a,i,j-i,'tail') end   
end
print(math.abs(rawget(a,1)-rawget(a,#a)))
print(intercall_table_sep(a," "))
