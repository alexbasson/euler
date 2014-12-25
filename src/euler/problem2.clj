(ns euler.problem2)

(defn fibonacci
  [n]
  (defn fib-iter
    [n a b]
    (if (= 0 n)
      a
      (fib-iter (- n 1) b (+ a b))))
  (fib-iter n 0 1))

(defn sum-of-even-fibs
  [limit]
  (loop [n 1
         evens []]
    (if (> (fibonacci n) limit)
      (do
        (println evens)
        (reduce + 0 evens))
      (let [fib (fibonacci n)]
        (if (= 0 (mod fib 2))
          (recur (inc n) (conj evens fib))
          (recur (inc n) evens))
        ))))
