(ns noir3-basic.views.welcome
  (:require [noir3-basic.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [clojure.tools.logging :only [error info]]))

(defpage "/welcome" []
  (info "welcome page")
  (common/layout
   [:p "Welcome to noir3-basic"]))
