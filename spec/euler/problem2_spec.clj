(ns euler.problem2-spec
  (:require [speclj.core :refer :all]
            [euler.problem2 :refer :all]))

(describe "generating fibonacci numbers"
  (it "should return 1 for n = 1"
    (should= 1 (fibonacci 1)))

  (it "should return 1 for n = 2"
    (should= 1 (fibonacci 2)))

  (it "should return 2 for n = 3"
    (should= 2 (fibonacci 3)))

  (it "should return 3 for n = 4"
    (should= 3 (fibonacci 4)))

  (it "should return 5 for n = 5"
    (should= 5 (fibonacci 5)))

  (it "should return 8 for n = 6"
    (should= 8 (fibonacci 6)))

  (it "should return 13 for n = 7"
    (should= 13 (fibonacci 7)))

  (it "should return 21 for n = 8"
    (should= 21 (fibonacci 8)))

  (it "should return 34 for n = 9"
    (should= 34 (fibonacci 9)))

  (it "should return 55 for n = 10"
    (should= 55 (fibonacci 10)))
  )

(describe "sum-of-even-fibs"
  (it "should return the sum of the even fibonacci numbers less than the input"
    (should= 44 (sum-of-even-fibs 40))))
