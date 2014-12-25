(ns euler.problem3-spec
  (:require [speclj.core :refer :all]
            [euler.problem3 :refer :all]))

(describe "prime-factors"
  (it "should factor 13195 into 5, 7, 13, 29"
    (should= [5 7 13 29] (prime-factors 13195))))

(describe "prime-factors"
  (it "should return the largest prime factor"
    (should= 29 (largest-prime 13195))))
