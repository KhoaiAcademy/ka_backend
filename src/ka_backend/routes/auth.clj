(ns ka_backend.routes.auth)

(defn auth-handler [&args]
  {:get  {:status 200
          :body   "authentication status"}
   :post (fn [{{:keys [username password]} :body-params}]
           {:status 200
            :body   "ok"})})
