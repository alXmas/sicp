(ns chapter-1.ex11-test
  (:require [clojure.test :refer [is deftest]]
            [chapter-1.ex11 :as ex]))

(deftest F
  (is (= 1 (ex/F 1)))
  (is (= 2 (ex/F 2)))
  (is (= 3 (ex/F 3)))
  (is (= 6 (ex/F 4)))
  (is (= 11 (ex/F 5)))
  (is (= 20 (ex/F 6))))
