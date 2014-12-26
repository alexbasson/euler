(ns euler.problem7)

(defn prime?
  [p lesser-primes]
  (loop [primes lesser-primes]
    (let [[prime & rest] primes]
      (if (or (empty? primes) (> prime (Math/sqrt p)))
        true
        (if (= 0 (mod p prime))
          false
          (recur rest)
        )
      )
    )
  )
)

(defn prime
  [n]
  (loop [counter 2
         primes []]
    (if (= n (count primes))
      (last primes)
      (if (prime? counter primes)
        (recur (inc counter) (conj primes counter))
        (recur (inc counter) primes)
      )
    )
  )
)
