(ns euler.problem4-spec
  (:require [speclj.core :refer :all]
            [euler.problem4 :refer :all]))

(describe "digits"
  (it "should return a vector containing the digits of the input"
    (should= [5 4 3 2 1] (digits 12345))))

(describe "palindrome?"
  (it "should determine that 123321 is a palindrome"
    (should (palindrome? 123321)))

  (it "should determine that 12321 is a palindrome"
    (should (palindrome? 12321)))

  (it "should determin that 12345 is not a palindrome"
    (should-not (palindrome? 1234)))

  (it "should determine that 123456 is not a palindrome"
    (should-not (palindrome? 123456)))
  )
