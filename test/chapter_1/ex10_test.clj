(ns chapter-1.ex7-test
  (:require [clojure.test :refer [is deftest]]
            [chapter-1.ex10 :as ex]))

(deftest A
  (is (= 1024 (ex/A 1 10)))
  (is (= 65536 (ex/A 2 4)))
  (is (= 65536 (ex/A 3 3))))
