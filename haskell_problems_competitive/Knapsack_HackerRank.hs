knapsack :: [Int] -> Int -> [Int]
knapsack []             _ = []
knapsack numbers@(x:xs) k
    | x > k             = knapsack xs k
    | k `mod` x == 0    = replicate (k `div` x) x
    | otherwise = merge withX withoutX
    where withX = x : (knapsack numbers (k - x))
          withoutX = knapsack xs k
          merge a b = if sum a > sum b then a else b
