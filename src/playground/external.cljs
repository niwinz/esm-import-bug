(ns playground.external
  (:require
   ["lodash/debounce.js" :as ldebounce]))

(defn debounce
  [& params]
  (apply ldebounce params))
