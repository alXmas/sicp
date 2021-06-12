(ns chapter-1.ex2-test
  (:require [clojure.test :refer [is deftest]]
            [chapter-1.ex2 :as ex]))

(deftest solution
  (is (= -37/150 ex/solution)))
