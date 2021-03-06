(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< 0 x) x (- 0 x)))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (if (list? x) true (vector? x) )(* 2 (count x))
    :else true))

(defn leap-year? [year]
  (or (and
        (divides? 4 year)
        (not (divides? 100 year)))
      (divides? 400 year)
      )
  )

; A year is a leap year if it is divisible by 4,
; except if it is divisible by 100, in which case
; it still is a leap year if it is divisible by 400.

; '_______'
