(ns euler.problem8-spec
  (:require [speclj.core :refer :all]
            [euler.problem8 :refer :all]))

(describe "greatest-product"
  (it "should return the greatest product of any n-length subsequence"
    (should= 5832 (greatest-product 4))
  )
)
