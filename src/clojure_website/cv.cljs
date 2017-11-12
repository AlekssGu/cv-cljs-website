(ns clojure-website.cv
    (:require [clojure-website.translate :as i18n]))

(defn education []
    [:dl.dl-horizontal
        [:dt (i18n/translate :en :education/university-of-latvia)],
        [:dd
            [:p (i18n/translate :en :education/msc-title)],
            [:p.narrow-top (i18n/translate :en :education/msc-date)]],
        [:dt (i18n/translate :en :education/university-of-latvia)],
        [:dd
            [:p (i18n/translate :en :education/bsc-title)],
            [:p.narrow-top (i18n/translate :en :education/bsc-date)]],
        [:hr],
        [:dt (i18n/translate :en :education/certifications-title)],
        [:dd
            [:p (i18n/translate :en :education/oracle-ca-title)],
            [:p.narrow-top (i18n/translate :en :education/oracle-ca-date)]]])

(defn work-experience []
    [:dl.dl-horizontal
        [:dt (i18n/translate :en :work/autentica-title)],
        [:dd
            [:p (i18n/translate :en :work/autentica-position)],
            [:p.narrow-top (i18n/translate :en :work/autentica-date)],
            [:p (i18n/translate :en :work/autentica-responsibilities)]],
        [:dt (i18n/translate :en :work/dnb-title)],
        [:dd
            [:p (i18n/translate :en :work/dnb-position)],
            [:p.narrow-top (i18n/translate :en :work/dnb-date)],
            [:p (i18n/translate :en :work/dnb-responsibilities)]]])

(defn skills []
    [:dl.dl-horizontal
        [:dt (i18n/translate :en :skills/job-related-title)],
        [:dd
            [:p (i18n/translate :en :skills/primary-skills)],
            [:p (i18n/translate :en :skills/experience-in)],
            [:p.narrow-top (i18n/translate :en :skills/additional-skills)]],
    [:dt (i18n/translate :en :skills/personal-title)],
        [:dd
            [:p (i18n/translate :en :skills/languages)],
            [:p (i18n/translate :en :skills/self-motivated)],
            [:p.narrow-top (i18n/translate :en :skills/continuous-learning)],
            [:p.narrow-top (i18n/translate :en :skills/friendly)]]])