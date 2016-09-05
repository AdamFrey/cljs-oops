(ns oops.state)

; we want to isolate all state-full information into this namespace
; please note that we have two important independent environments:
;   1. compiler state
;   2. runtime state

; use oops.config/get-current-compiler-config to get currently effective config
(def ^:dynamic *compiler-config*)