(ns euler.problem1)

(defn divisible-by-3?
  [number]
  (if (= 0 (mod number 3))
    true
    false))

(defn sum-of-multiples-of-3-and-5
  [number]
  (loop [n 0
         multiples []]
    (if (= number n)
      (reduce + 0 multiples)
      (if (or (= 0 (mod n 3))
              (= 0 (mod n 5)))
        (recur (inc n) (conj multiples n))
        (recur (inc n) multiples)))))

