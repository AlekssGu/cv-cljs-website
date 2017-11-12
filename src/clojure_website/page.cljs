(ns clojure-website.page
    (:require [clojure-website.cv :as cv :refer [education]]
              [clojure-website.footer-parts :as footer-part]
              [clojure-website.translate :as i18n]))

(defn header []
    [:div
        [:div {:class "row lead-div-top"}
            [:div {:class "col-md-offset-5 col-md-2 col-sm-offset-5 col-sm-2 col-xs-4 col-xs-offset-4"}
                [:img {:class "img-responsive img-circle" :src "images/image.jpg" :alt (i18n/translate :en :title/name)}]]],
        [:div {:class "row lead-div-bottom"}
            [:div {:class "col-md-12 text-center"}
                [:h1 (i18n/translate :en :title/name),
                    [:a {:href "https://www.linkedin.com/in/alekssgu"}
                        [:i {:class "fa fa-linkedin text-muted"}]]],
                [:h3.lead (i18n/translate :en :title/lead)]]]])

  (defn footer []
    [:div
        [:div {:class "row lead-div"}
            [:div {:class "col-md-offset-4 col-md-8"}
                [:blockquote.blockquote
                    [:p (i18n/translate :en :quote/text)],
                    [:footer (i18n/translate :en :quote/author)]]]],
            [:hr],
            (footer-part/footer-md),
            (footer-part/footer-xs)])

  (defn content []
    [:div.row
        [:div.col-md-4
            [:h3.text-center (i18n/translate :en :education/title)],
            (cv/education)],
        [:div.col-md-4
            [:h3.text-center (i18n/translate :en :work/title)],
            (cv/work-experience)],
        [:div.col-md-4
            [:h3.text-center (i18n/translate :en :skills/title)],
            (cv/skills)]])