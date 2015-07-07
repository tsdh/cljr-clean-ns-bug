(ns cljr-clean-ns-bug.core
  ;; BUG: Do M-x cljr-clean-ns RET here and the require below will get removed
  ;; although it is actually needed.
  (:require [cljr-clean-ns-bug.utils :as u]))

(defn foo
  "I don't do a whole lot."
  [x]
  (u/some-macro "foo"))
