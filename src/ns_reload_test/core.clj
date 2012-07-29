(ns ns-reload-test.core)

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!")):w

(load "core/subspace")
