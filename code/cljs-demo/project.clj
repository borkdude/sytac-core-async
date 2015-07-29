(defproject cljs-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]                 ]

  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-figwheel "0.3.1"]]

  :clean-targets ^{:protect false} [:target-path :compile-path "out"]

  :cljsbuild {:builds [{:id "sytac"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:output-to "main.js"
                                   :output-dir "out"
                                   :optimizations :none
                                   :asset-path "out"
                                   :main "cljs-demo.main"
                                   :source-map true}}]}

  :global-vars {*print-length* 20})
