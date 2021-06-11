(ns chapter-1.ex3-test
  (:require [clojure.test :refer [is deftest testing]]
            [chapter-1.ex3 :as SUT]))

;; Testing approach
;; `deftest` each public function in a namespace
;; `deftest-` each function that will be private (development only)
;; `testing` different aspects of a specific function
;; `is` assertion with intent in string
