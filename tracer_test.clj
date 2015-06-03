(ns tracer-test
  (:require [clojure.test :refer :all]))

(deftest f-test
  (is (= 1 1)))

(run-tests)
