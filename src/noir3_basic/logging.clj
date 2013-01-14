(ns noir3-basic.logging
  (:use [clojure.tools.logging :only [error info]]
        [clj-logging-config.log4j]))

(set-logger! "noir3-basic"
             :pattern "%d %-5p %c: %m%n")
