(ns chapter3.core
  (:gen-class))

(defn plusAHundred
  [num]
  (+ num 100)
)

(defn -main
  [& args]

  ["a" "vector" "of" "strings"]
  (println "Hello, World!")
  (println "a string")
  (println (+ 1 2 3))

  (def self "She who must not be named")
  (println (str "I am " self))
  (println (vector "buffy" "the" "vampire" "slayer"))
  (println (list "out" "for" "a" "walk" "bitch"))
  (println (hash-map :hello "hola" :bye "adios" :darling "pendejo"))
  (println (hash-set 1 1 1 1 5))

  (println (plusAHundred 17))
  
  (defn dec-maker
  [dec-by]
  #(- % dec-by))
  (def dec3 (dec-maker 3))
  (println (dec3 7))

  (defn mapset
    [func, l]
    (into #{} (map func l))
  )

  (println (mapset inc [1 1 1 1]))
  (println (map inc [1 1 1 1]))
  
)

;; 1. Use the str, vector, list, hash-map, and hash-set functions.
;; 2. Write a function that takes a number and adds 100 to it.
;; 3. Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:
;; 4. Write a function, mapset, that works like map except the return value is a set:
;;                  (mapset inc [1 1 2 2])
;; => #{2 3}
