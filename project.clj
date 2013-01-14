(defproject noir3-basic "0.1.0"
            :description "A barebones noir3 web app to use as a starting point for real apps"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [ring "1.1.0"]
                           [ring-server "0.2.5"]
                           [org.clojure/tools.logging "0.2.3"]
                           [clj-logging-config "1.9.10"]]
            :plugins [[lein-ring "0.7.5"]]
            :ring {:handler noir3-basic.server/handler}
            :main noir3-basic.server)

