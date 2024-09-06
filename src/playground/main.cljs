(ns playground.main
  (:require
   [playground.external :as ext]
   [clojure.string :as str]))

(defn split
  [s]
  (into-array (str/split s #"\w+")))

(def default
  #js {:split split
       :debounce ext/debounce})
