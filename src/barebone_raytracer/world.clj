(ns barebone-raytracer.world
  (:require [barebone-raytracer.geo-obj :as geo-obj])
)

(defrecord World [viewplane background_color sphere tracer])

(defn build [world])

(defn render_scene [world]
;  (open_window (:hres (:viewplane world)) (:vres (:viewplane world))))
)

(defn display_pixel [row column color])

(defn test_world [hres]
  (def world (->World (geo-obj/->ViewPlane 100 200 1 1 1))))
