(ns clojure-website.cv
    (:require [clojure-website.core :as core]))

(defn education []
    [:dl.dl-horizontal
        [:dt (core/translate :en :education/university-of-latvia)],
        [:dd
            [:p (core/translate :en :education/msc-title)],
            [:p.narrow-top (core/translate :en :education/msc-date)]],
        [:dt (core/translate :en :education/university-of-latvia)],
        [:dd
            [:p (core/translate :en :education/bsc-title)],
            [:p.narrow-top (core/translate :en :education/bsc-date)]],
        [:hr],
        [:dt (core/translate :en :education/certifications-title)],
        [:dd
            [:p (core/translate :en :education/oracle-ca-title)],
            [:p.narrow-top (core/translate :en :education/oracle-ca-date)]]])

(defn work-experience []
    [:dl.dl-horizontal
        [:dt (core/translate :en :work/autentica-title)],
        [:dd
            [:p (core/translate :en :work/autentica-position)],
            [:p.narrow-top (core/translate :en :work/autentica-date)],
            [:p (core/translate :en :work/autentica-responsibilities)]],
        [:dt (core/translate :en :work/dnb-title)],
        [:dd
            [:p (core/translate :en :work/dnb-position)],
            [:p.narrow-top (core/translate :en :work/dnb-date)],
            [:p (core/translate :en :work/dnb-responsibilities)]]])

(defn skills []
    [:dl.dl-horizontal
        [:dt (core/translate :en :skills/job-related-title)],
        [:dd
            [:p (core/translate :en :skills/primary-skills)],
            [:p (core/translate :en :skills/experience-in)],
            [:p.narrow-top (core/translate :en :skills/additional-skills)]],
    [:dt (core/translate :en :skills/personal-title)],
        [:dd
            [:p (core/translate :en :skills/languages)],
            [:p (core/translate :en :skills/self-motivated)],
            [:p.narrow-top (core/translate :en :skills/continuous-learning)],
            [:p.narrow-top (core/translate :en :skills/friendly)]]])