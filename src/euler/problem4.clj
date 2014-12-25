(ns euler.problem4)

(defn digits
  [n]
  (loop [number n
         digits []]
    (if (> 1 (/ number 10))
      (conj digits number)
      (let [digit (mod number 10)]
        (recur (/ (- number digit) 10) (conj digits digit))))))

(defn palindrome?
  [n]
  (loop [forward-digits (digits n)
         reversed-digits (reverse (digits n))]
    (let [[first-digit & rest-of-forward-digits] forward-digits
          [last-digit & rest-of-reversed-digits] reversed-digits]
          (if (empty? forward-digits)
            true
            (if (= first-digit last-digit)
              (recur rest-of-forward-digits rest-of-reversed-digits)
              false)))
    )
  )

(def three-digit-products
  (loop [i 100
         j 100
         products []]
    (if (> i 999)
      products
      (if (> j 999)
        (recur (inc i) 100 (conj products (* i 100)))
        (recur i (inc j) (conj products (* i j)))
        )
      )
    )
  )

(def largest-palindrome
  (apply max (filter palindrome? three-digit-products)))
