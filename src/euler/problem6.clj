(ns euler.problem6)

(defn sum-of-squares
  [n]
  (loop [counter n
         sum 0]
    (if (= 0 counter)
      sum
      (recur (dec counter) (+ sum (* counter counter)))
    )
  )
)

(defn square-sum
  [n]
  (loop [counter n
         sum 0]
    (if (= 0 counter)
      (* sum sum)
      (recur (dec counter) (+ sum counter))
    )
  )
)

(defn solution
  [n]
  (- (square-sum n) (sum-of-squares n))
)

