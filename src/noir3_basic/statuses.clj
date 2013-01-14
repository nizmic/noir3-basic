(ns noir3-basic.statuses
  (:require [noir.statuses :as statuses]))

; example of custom 404 message
(statuses/set-page! 404 "404 Not Found")
