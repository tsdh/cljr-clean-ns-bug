(ns cljr-clean-ns-bug.utils)

(defmacro some-macro [arg]
  `(println ~arg))
