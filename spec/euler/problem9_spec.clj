(ns euler.problem9-spec
  (:require [speclj.core :refer :all]
            [euler.problem9 :refer :all]))

(describe "pythagorean?"
  (it "should determine that 3, 4, 5 is a pythagorean triple"
    (should (pythagorean? 3 4 5))
  )

  (it "should determine that 5, 12, 13 is a pythagorean triple"
    (should (pythagorean? 5 12 13))
  )

  (it "should determine that 3, 4, 6 is not a pythagorean triple"
    (should-not (pythagorean? 3 4 6))
  )
)
