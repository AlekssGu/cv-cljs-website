(ns clojure-website.translate
    (:require [tongue.core :as tongue]
              [clojure-website.dictionaries :as dictionaries]))

(def translate ;; [locale key & args] => string
  (tongue/build-translate dictionaries/dictionaries))