(ns euler.problem6-spec
  (:require [speclj.core :refer :all]
            [euler.problem6 :refer :all]))

(describe "sum-of-squares"
  (it "should sum the squares of the first n digits"
    (should= 385 (sum-of-squares 10))
  )
)

(describe "square-sum"
  (it "should square the sum of the first n digits"
    (should= 3025 (square-sum 10))
  )
)

(describe "solution"
  (it "should find the difference between the square sum and the sum of squares"
    (should= 2640 (solution 10))
  )
)
