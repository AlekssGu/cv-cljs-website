(ns clojure-website.footer-parts
    (:require [clojure-website.translate :as i18n]))

(defn link-linkedin [class]
    [:a {:class class :href "https://www.linkedin.com/in/alekssgu"} (i18n/translate :en :footer/leave-message) ])

(defn footer-xs []
    [:div {:class "row text-center visible-xs"}
        [:div.col-md-12
            [:p.text-muted (i18n/translate :en :footer/updated-at "12.11.2017")]]],
    [:div {:class "row text-center visible-xs"}
        [:div.col-md-12
            [:p
                [:em
                    (link-linkedin "text-muted")]]]])

(defn footer-md []
    [:div {:class "row hidden-xs"}
        [:div {:class "col-md-6 col-sm-6"}
            [:p {:class "text-muted text-left"} (i18n/translate :en :footer/updated-at "12.11.2017")]],
        [:div {:class "col-md-6 col-sm-6"}
            [:p.text-right
                [:em
                    (link-linkedin "text-muted")]]]])