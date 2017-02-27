(defproject chapter3 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot chapter3.core
  :target-path "target/%s"
  :plugins [[lein-environ "1.0.0"]]
  ;; Configuration here may be overridden by namespace metadata.
  :profiles {:uberjar {:aot :all} :dev {:env {:squiggly {:checkers [:eastwood :typed]
                                    :eastwood-exclude-linters [:unlimited-use]
                                    :eastwood-options {;; :builtin-config-files ["myconfigfile.clj"]
                                                       }}}}})
