(defproject ka_backend "0.1.0-SNAPSHOT"
  :description "Main backend for KA"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot ka-backend.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})