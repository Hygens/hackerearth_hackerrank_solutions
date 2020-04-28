-- Minimum Multiple
fconv::String->[Integer]
fconv s = map (read::String->Integer) (words s)
update i v xs = (take i xs) ++ ((xs !! i)*(toInteger v)):(drop (i+1) xs)
slice from to xs = Prelude.take (to - from + 1) (Prelude.drop from xs)
execNTimes 0 [] = return ()
execNTimes n xs = if n<=0  || null xs
    then return() 
    else do        
        si <- getLine
        let s = words si
            l = read (s !! 1) :: Int
            r = read (s !! 2) :: Int              
        if head s=="Q"
            then do
                let z = slice l r xs
                    m = foldl lcm 1 z
                print (m `mod` (toInteger 1000000007))
            else do
                let s1 = update l r xs
                execNTimes (n-1) s1
        execNTimes (n-1) xs
main = do
    siz <- getLine
    ai <- getLine
    ki <- getLine
    let  siz = read siz  
         xs = fconv ai
         k = read ki :: Int    
    execNTimes k xs
    

