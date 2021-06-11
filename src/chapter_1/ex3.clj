(ns chapter-1.ex3)

(defn sum-of-squares [x y]
  (+ (* x x) (* y y)))

(defn sulution
  [x y z]
  (cond
    (and (< x y) (< x z))
    (sum-of-squares y z)
    (< x y)
    (sum-of-squares x y)
    (< x z)
    (sum-of-squares x z)
    (< y z)
    (sum-of-squares z x)
    :else
    (sum-of-squares y x)))
