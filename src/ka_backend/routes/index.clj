(ns ka_backend.routes.index
  (:require [org.httpkit.server :as server]
            [reitit.ring :as ring]
            [aero.core :refer (read-config)])
  (:require [ka_backend.routes.auth :refer (auth-handler)]))

(def routes
  ["/v1.0"
   ["/auth" auth-handler]])
