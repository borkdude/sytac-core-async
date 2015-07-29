(ns cljs-demo.main
  (:require-macros [cljs.core.async.macros :refer (go)])
  (:require
   [cljs.core.async :refer (<!)]))

(enable-console-print!)

;; (defn f [x]
;;     (inc x))

;; (defn f [x]
;;   (if (odd? x) x
;;       (inc x)))

;; (defn f [x]
;;   (set! x "bar"))

;; (def foo (js-obj "bar" "baz"))
;; (set! (.-bar foo) "baaz")
;; (aset foo "abc" 17)

;; (js/alert "foo")
;; (.getTime (js/Date.))
;; (.. (js/Date.) (getTime) (toString))

;; ;; vectors
;; (def v [1 2 3])
;; (conj v 4)
;; (get v 0)
;; (v 0)

;; ;; hash maps
;; (def m {:foo 1 :bar 2})
;; (assoc m :foo 2)
;; (get m :foo)
;; (m :foo)
;; (:foo m)
;; (dissoc m :foo)

;; ;; functional programming
;; (def numbers (range 10))
;; (filter odd? numbers)
;; (map inc numbers)
;; (reduce + numbers)
;; (reductions + numbers)

;; ;; sequences
;; (first [1 2 3])
;; (rest [1 2 3])
;; (distinct [1 1 2 3])
;; (take 2 (range 10))

;; ;; lazy sequences
;; (take 2 (map
;;          (fn [n] (js/alert n) n)
;;            (range)))

;; ;; atoms/mutable state
;; (def my-atom (atom 0))
;; @my-atom
;; (reset! my-atom 1)
;; (reset! my-atom (inc @my-atom))
;; (swap! my-atom (fn [old-value]
;;                  (inc old-value)))
;; (swap! my-atom inc)
;; @my-atom

;; ;; macros
;; (map inc
;;      (filter odd?
;;              (range 10)))

;; (->>
;;  (range 10)
;;  (filter odd?)
;;  (map inc))

;; (macroexpand
;;   '(->> (range 10) (filter odd?)))

;; (macroexpand
;;   '(->> (range 10)
;;         (filter odd?)
;;         (map inc)))
