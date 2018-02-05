(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (max x (- x)))

(defn divides? [divisor n]
 (if (= (mod n divisor) 0)
  true
  false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0)"gotcha"
    (= (mod n 3) 0)"fizz"
    (= (mod n 5) 0)"buzz"
    :else ""))

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen? [age]
  (if (not (<= 13 age 19))
    true
    false))

(defn generic-doublificate [x]
  (cond
   (number? x) (+ x x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
    :else false))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (and (divides? 4 year) (not(divides? 100 year))) true
     :else false))

; '_______'
