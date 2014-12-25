(ns euler.problem1-spec
  (:require [speclj.core :refer :all]
            [euler.problem1 :refer :all]))

(describe "divisible-by-3?"
  (it "should return true that 6 is divisble by 3"
    (should (divisible-by-3? 6)))

  (it "should return true that 7 is not divisible by 3"
    (should-not (divisible-by-3? 7))))

(describe "sum-of-multiples-of-3-and-5"
  (it "should return 23"
    (should= 23 (sum-of-multiples-of-3-and-5 10))))
