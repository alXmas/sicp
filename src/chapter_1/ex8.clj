(ns chapter-1.ex8
  (:use [chapter-1.ex3 :only [square]])
  (:use [chapter-1.ex7 :only [abs]]))

(defn good-enough?
  [last-guess guess]
  (< (/ (abs (- guess last-guess))
        last-guess)
     1/10000000))
(defn improve
  [guess x]
  (/ (+ (/ x (square guess))
        (* 2 guess))
     3))
(defn cbrt-iter
  [guess x]
  (if (good-enough? guess (improve guess x))
    guess
    (recur (improve guess x) x)))
(defn cbrt
  [x]
  (cbrt-iter 1.0 x))
