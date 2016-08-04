(ns lettergradestest
	(:use clojure.test)
	(:use lettergrades))

(deftest numeric-letter-grades
	(dorun (map #(is (= "A" (letter-grade %))) (range 90 100))))

(deftest string-letter-grades
	(dorun (map #(is (= (.toUpperCase %)
			(letter-grade %))) ["A" "B"])))

(run-all-tests)
