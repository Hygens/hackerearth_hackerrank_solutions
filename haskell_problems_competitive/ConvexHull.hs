-- Convex hull using Graham Scan

import Data.List

type P = (Double, Double)

cross :: P -> P -> P -> Double
cross a b c = (fst b - fst a) * (snd c - snd a) - (fst c - fst a) * (snd b - snd a)

cmpCross :: P -> P -> P -> Ordering
cmpCross p a b = let cmp                  = compare (cross p a b) 0.0
                     dist (x1,y1) (x2,y2) = sqrt((x1-x2)^2 +(y1-y2)^2)
                 in if cmp == EQ
                    then compare (dist p a) (dist p b)
                    else cmp

convex :: [P] -> [P]
convex xs = let pivot    = minimum xs
                sortedPs = sortBy (cmpCross pivot) (delete pivot (nub xs))
            in clean pivot (tail sortedPs) [head sortedPs, pivot]

clean :: P-> [P] -> [P] -> [P]
clean pivot [] acc = acc
clean pivot (x:xs) (a1:a2:acc) = if cross a2 a1 x > 0 && length acc > 0
                                 then clean pivot (x:xs) (a2:acc)
                                 else clean pivot xs (x:a1:a2:acc)