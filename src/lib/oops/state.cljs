(ns oops.state
  (:require-macros [oops.state]))

; use oops.config/get-current-runtime-config to get currently effective config
(def ^:dynamic *runtime-config*)