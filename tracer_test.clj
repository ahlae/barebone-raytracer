(ns tracer-test
  (:require [clojure.test :refer :all]))

(deftest f-test
  (is (= 1 2)))

(run-tests)
