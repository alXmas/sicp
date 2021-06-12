(ns chapter-1.ex4)

;;; The if conditional selects which operator to use at runtime based
;;; on the value of b.

(defn a-plus-abs-b
  [a b]
  ((if (> b 0) + -) a b))
