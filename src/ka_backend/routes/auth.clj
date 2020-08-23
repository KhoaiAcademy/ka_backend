(ns ka_backend.routes.auth)

(defn check-auth
  "confirm authentication status"
  []
  {:status 200 :body "authenticated"})

(defn sign-in
  "post method handler"
  [request]
  (let [body     {:body-params request}
        username {:username body}
        password {:password body}]
    {:status 200
     :body   "ok"}))

(defn auth-handler [&args]
  {:get  check-auth
   :post sign-in})
