(ns clojure-website.core
    (:require [reagent.core :as reagent :refer [atom]]
              [clojure-website.page :as page]
              [tongue.core :as tongue]
              [clojure-website.dictionaries :as dictionaries]))

(enable-console-print!)

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:language "en"}))

(def translate ;; [locale key & args] => string
  (tongue/build-translate dictionaries/dictionaries))

(defn main-page []
  [:div.container-fluid
    [:div.header (page/header)],
    [:div.content (page/content)],
    [:div.footer (page/footer)]])

(reagent/render-component [main-page]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)