(ns chapter-1.ex7
  (:use [chapter-1.ex3 :only [square]]))

(defn abs [n] (max n (- n)))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))


(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) 
               x)))

(defn sqrt [x] (sqrt-iter 1.0 x))


(defn better-good-enough? [prev-guess guess x]
  (< (abs (- guess prev-guess))
     0.000001))

(defn better-sqrt [x]
  (loop [prev-guess 0 guess 1.0]
    (if (better-good-enough? prev-guess guess x)
      guess
      (recur guess (improve guess x)))))
