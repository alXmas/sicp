(ns chapter-1.ex4-test
  (:require [clojure.test :refer [is deftest]]
            [chapter-1.ex4 :as ex]))

(deftest a-plus-abs-b
  (is (= 4 (ex/a-plus-abs-b 2 -2)))
  (is (= 1 (ex/a-plus-abs-b 1 0)))
  (is (= 4 (ex/a-plus-abs-b 2 2))))
