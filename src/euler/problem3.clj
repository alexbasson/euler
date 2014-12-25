(ns euler.problem3)

(defn prime-factors
  [n]
  (loop [p 2
         factored n
         prime-factors []]
    (if (> p factored)
      prime-factors
      (if (= 0 (mod factored p))
        (recur p (/ factored p) (conj prime-factors p))
        (recur (inc p) factored prime-factors)))))

(defn largest-prime
  [n]
  (apply max (prime-factors n)))
