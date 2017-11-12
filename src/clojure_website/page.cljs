(ns clojure-website.page
    (:require [clojure-website.cv :as cv :refer [education]]
              [clojure-website.core :as core]))

(defn header []
    [:div
        [:div {:class "row lead-div-top"}
            [:div {:class "col-md-offset-5 col-md-2 col-sm-offset-5 col-sm-2 col-xs-4 col-xs-offset-4"}
                [:img {:class "img-responsive img-circle" :src "images/image.jpg" :alt (core/translate :en :title/name)}]]],
        [:div {:class "row lead-div-bottom"}
            [:div {:class "col-md-12 text-center"}
                [:h1 (core/translate :en :title/name),
                    [:a {:href "https://www.linkedin.com/in/alekssgu"}
                        [:i {:class "fa fa-linkedin text-muted"}]]],
                [:h3.lead (core/translate :en :title/lead)]]]])

  (defn footer []
    [:div
        [:div {:class "row lead-div"}
            [:div {:class "col-md-offset-4 col-md-8"}
                [:blockquote.blockquote
                    [:p (core/translate :en :quote/text)],
                    [:footer (core/translate :en :quote/author)]]]],
            [:hr],
            [:div {:class "row hidden-xs"}
                [:div {:class "col-md-6 col-sm-6"}
                    [:p {:class "text-muted text-left"} (core/translate :en :footer/updated-at "12.11.2017")]],
                [:div {:class "col-md-6 col-sm-6"}
                    [:p.text-right
                        [:em
                            [:a.text-muted {:href "https://www.linkedin.com/in/alekssgu"} (core/translate :en :footer/leave-message)]]]]],
            [:div {:class "row text-center visible-xs"}
                [:div.col-md-12
                    [:p.text-muted (core/translate :en :footer/updated-at "12.11.2017")]]],
            [:div {:class "row text-center visible-xs"}
                [:div.col-md-12
                    [:p
                        [:em
                            [:a.text-muted {:href "https://www.linkedin.com/in/alekssgu"} (core/translate :en :footer/leave-message) ]]]]] ])

  (defn content []
    [:div.row
        [:div.col-md-4
            [:h3.text-center (core/translate :en :education/title)],
            (cv/education)],
        [:div.col-md-4
            [:h3.text-center (core/translate :en :work/title)],
            (cv/work-experience)],
        [:div.col-md-4
            [:h3.text-center (core/translate :en :skills/title)],
            (cv/skills)]])