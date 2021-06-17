(ns chapter-1.ex7-test
  (:require [clojure.test :refer [is deftest]]
            [chapter-1.ex7 :as ex]))

(deftest good-enough?
  (is (= false (ex/good-enough? 22 4)))
  (is (= false (ex/good-enough? 3 5)))
  (is (= false (ex/good-enough? 9 2))))

(deftest average
  (is (= 3/2 (ex/average 2 1)))
  (is (= 1.4165 (ex/average 1.333 1.5)))
  (is (= 1.41425 (ex/average 1.4167 1.4118))))

(deftest improve
  (is (= 1/2 (ex/improve 2 -2)))
  (is (= 1/2 (ex/improve 1 0)))
  (is (= 3/2 (ex/improve 2 2))))

(deftest sqrt-iter
  (is (= 3.00009155413138 (ex/sqrt-iter 1.0 9)))
  (is (= 2.0000000929222947 (ex/sqrt-iter 1.0 4)))
  (is (= 8.000001655289593 (ex/sqrt-iter 1.0 64))))

(deftest sqrt
  (is (= 3.00009155413138 (ex/sqrt 9)))
  (is (= 2.0000000929222947 (ex/sqrt 4)))
  (is (= 8.000001655289593 (ex/sqrt 64))))
