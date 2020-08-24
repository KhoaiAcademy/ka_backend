(defproject ka_backend "0.1.0-SNAPSHOT"
  :description "Main backend for KA"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [http-kit "2.3.0"]
                 [metosin/reitit "0.4.2"]
                 [ring/ring-devel "1.8.0"]
                 [com.taoensso/timbre "4.10.0"]
                 [clj-postgresql "0.7.0"]
                 [seancorfield/next.jdbc "1.1.582"]
                 [org.postgresql/postgresql "42.2.2"]
                 [com.layerware/hugsql "0.5.1"]
                 [aero "1.1.6"]]
  :main ka_backend.core
  :repl-options {:init-ns ka_backend.core}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :user
             {:plugins [[lein-kibit "0.1.8"]
                        [lein-cloverage "1.1.2"]
                        [jonase/eastwood "0.3.10"]]}})
