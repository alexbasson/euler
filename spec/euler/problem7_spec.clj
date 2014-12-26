(ns euler.problem7-spec
  (:require [speclj.core :refer :all]
            [euler.problem7 :refer :all]))

(describe "prime"
  (it "should return 2 for n = 1"
    (should= 2 (prime 1))
  )

  (it "should return 3 for n = 2"
    (should= 3 (prime 2))
  )

  (it "should return 5 for n = 3"
    (should= 5 (prime 3))
  )

  (it "should return 7 for n = 4"
    (should= 7 (prime 4))
  )

  (it "should return 11 for n = 5"
    (should= 11 (prime 5))
  )

  (it "should return 13 for n = 6"
    (should= 13 (prime 6))
  )
)
