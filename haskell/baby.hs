doubleMe x = x + x

doubleUs x y = doubleMe x + doubleMe y

doubleSmallNumber x =
  if x > 100
  then x
  else x * 2

conanO'Brien = "It's me, Conan O'Brien"

factorial :: Integer -> Integer
factorial n = product[1..n]

circumference :: Float -> Float
circumference r = 2 * pi * r

circumferenceP :: Double -> Double
circumferenceP r = 2 * pi * r

removeNonUppercase :: [Char] -> [Char]
removeNonUppercase st = [ c | c <- st, elem c ['A'..'Z']]

lucky :: (Integral a) => a -> String
lucky 7 = "Your Lucky !"
lucky x = "Nope, bad luck !"

factorialRec :: (Integral a) => a -> a
factorialRec 0 = 1
factorialRec n = n * factorialRec(n - 1)

first :: (a,b,c) -> a
first (a,_,_) = a
second :: (a,b,c) -> b
second (_,b,_) = b
third :: (a,b,c) -> c
third (_,_,c) = c


cutHead :: [a] -> a
cutHead [] = error "On ne peut pas coupé la tête d'une liste vide, petit rigolo"
cutHead (x:_) = x

getLength :: (Num b) => [a] -> b
getLength [] = 0
getLength (_:xs) = 1 + getLength(xs)

makeSum :: (Num a) => [a] -> a
makeSum [] = 0
makeSum (x:xs) = x + makeSum(xs)

fisrtLetter :: String -> String
fisrtLetter "" = "Oups, c'est une chaîne vide, donc aucune 1ere lettre..."
fisrtLetter all@(x:xs) = "La 1ere lettre de la String : '" ++ all ++ "' est : '" ++ [x] ++ "'"

bmiTell :: (RealFloat a) => a -> String
bmiTell bmi
  | bmi <= 18.5 = "Sous-poids"
  | bmi <= 25   = "Standard"
  | bmi <= 30   = "Sur-poids"
  | otherwise   = "Obesite"



