(ns chapter-1.ex11)

(defn F [n]
  (if (< n 3)
    n
    (+ (F (- n 1)) (F (- n 2)) (F (- n 3)))))
