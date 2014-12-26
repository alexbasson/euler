(ns euler.problem9)

(defn pythagorean?
  [a b c]
  (= (* c c)
     (+ (* a a)
        (* b b))
  )
)

(def triples
  (loop [a 1
         b 2]
    (let [c (- 1000 (+ a b))]
      (if (pythagorean? a b c)
        (* a b c)
        (if (> b 999)
          (recur (inc a) (+ 2 a))
          (recur a (inc b))
        )
      )
    )
  )
)
