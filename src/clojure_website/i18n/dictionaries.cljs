(ns clojure-website.dictionaries
    (:require [tongue.core :as tongue]))

(def dictionaries
  { :en {
          :title {
              :name "Aleksandrs Gusevs " ; space is left on purpose
              :lead "Oracle PL/SQL Developer Certified Associate & IT professional"
          }

          :quote {
              :text "Mediocrity will never do. You are capable of something better."
              :author "Gordon B. Hinckley"
          }

          :footer {
              :updated-at "Last updated by Aleksandrs Gusevs on {1}"
              :leave-message "Leave me a message on LinkedIn"
          }

          :education {
              :title "Education"
              :university-of-latvia "University of Latvia"
              :msc-title "Master's degree, Computer Science"
              :msc-date "2016 - now"
              :bsc-title "Bachelor's degree, Computer Science"
              :bsc-date "2012 - 2016"
              :certifications-title "Certifications"
              :oracle-ca-title "Oracle PL/SQL Developer Certified Associate"
              :oracle-ca-date "As of November, 2016"
          }

          :work {
              :title "Work experience"
              ; Autentica
              :autentica-title "Autentica Ltd"
              :autentica-position "Software developer"
              :autentica-date "2013 - now"
              :autentica-responsibilities "Main responsibility is to maintain and develop Rural Support Service's (state administration institution) system.
                                            Other responsibilities include mentoring, requirements analysis, continuous integration and delivery as well as Oracle PL/SQL
                                            code optimization and refactoring. To accomplish my day-to-day development tasks I mainly use Oracle PL/SQL, Java, Ruby on Rails,
                                            Shell scripting and a little bit of Python."
              ; DNB bank
              :dnb-title "DNB bank"
              :dnb-position "Systems analyst internship"
              :dnb-date "April 2013 - June 2013"
              :dnb-responsibilities "Regulation of testing process. Main responsibilities: collaboration with business representatives,
                                        software developers and bank's IT professionals. Other responsibilities include end user training as well as testing of the system."
          }

          :skills {
              :title "Skills"
              ; Job related skills
              :job-related-title "Job related"
              :primary-skills "Primary: Oracle PL/SQL, Java"
              :experience-in "Experience in: Ruby on Rails, Shell, PHP"
              :additional-skills "Additionally: Jenkins (CI & CD), Jira, SVN, Git"
              ; Personal skills
              :personal-title "Personal"
              :languages "Languages: Latvian, Russian, English"
              :self-motivated "Self-motivated and fast learner."
              :continuous-learning "Striving for continuous learning and overall greatness."
              :friendly "Friendly and great team player."
          }
        }

    :tongue/fallback :en }     ;; fallback locale key
)