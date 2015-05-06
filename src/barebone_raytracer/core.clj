(ns barebone-raytracer.core
  (:gen-class)
  (:require [barebone-raytracer.world :as world]
            [barebone-raytracer.tracer :as tracer]
            [barebone-raytracer.geo-obj :as geo-obj]
            [barebone-raytracer.jswing :as jswing]))

(defn -main
  ""
  [& args]
  (jswing/canvas))

(-main)
