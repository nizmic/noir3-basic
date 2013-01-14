(ns noir3-basic.server
  (:require [noir.server :as server]
            [noir3-basic.logging]
            [noir3-basic.statuses]
            [noir3-basic.views.common]
            [noir3-basic.views.welcome]))

(server/load-views-ns 'noir3-basic.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'noir3-basic})))

(def handler (server/gen-handler {:mode :dev
                                  :ns 'noir3-basic}))

