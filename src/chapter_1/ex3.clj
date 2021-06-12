(ns chapter-1.ex3)

(defn square [x] (* x x))

(defn sum-of-squares [x y]
  (+ (square x)
     (square y)))

(defn largest-sum-of-squares [a b c]
  (cond (>= a b) (cond (>= b c) (sum-of-squares a b)
                       :else    (sum-of-squares a c))
        (>= b c) (cond (>= c a) (sum-of-squares b c)
                       :else    (sum-of-squares b a))
        (>= c a) (cond (>= a b) (sum-of-squares c a)
                       :else    (sum-of-squares c b))))
