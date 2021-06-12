(ns chapter-1.ex3-test
  (:require [clojure.test :refer [is deftest]]
            [chapter-1.ex3 :as ex]))
(deftest square
  (is (= 4 (ex/square -2)))
  (is (= 4 (ex/square 2)))
  (is (= 1 (ex/square 1))))

(deftest sum-of-squares
  (is (= 8 (ex/sum-of-squares 2 2)))
  (is (= 32 (ex/sum-of-squares 4 4)))
  (is (= 34 (ex/sum-of-squares 3 5))))

(deftest largest-sum-of-squares
  (is (= 13 (ex/largest-sum-of-squares 2 3 2)))
  (is (= 8 (ex/largest-sum-of-squares 2 1 2)))
  (is (= 10 (ex/largest-sum-of-squares 3 1 1))))
