(defn abs[x]
  (if (< x 0) (- x) x))

(def eps 1e-8)

(defn sqrt
  ([x] (sqrt x 1 0))
  ([x guess last-guess]
    (if (< (abs (- guess last-guess)) eps)
      guess
      (recur x (double (/ (+ guess (/ x guess)) 2)) guess))))
      ; use `double` to convert ratio to float numbers, avoiding overflow.

