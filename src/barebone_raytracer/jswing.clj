(ns barebone-raytracer.jswing
  (:require seesaw.core)
  (:require seesaw.graphics)
  (:require seesaw.color))

(def pixelmap (vec (repeat 500 (vec (repeat 300 (seesaw.color/color 255 0 0 255))))))

(defn drawPixelMap
  [c g]
  (reduce 
    (fn [g [x y]]
      (seesaw.graphics/draw g (seesaw.graphics/rect (first [x y]) (second [x y]) 0 0) (seesaw.graphics/style :foreground (get-in pixelmap [x y]))))
    g (for [x (range 500) y (range 300)] [x y])))

(defn content-panel
  []
  (seesaw.core/border-panel :center (seesaw.core/canvas :id :my_scene :paint drawPixelMap)))

(defn canvas
  []
  (def f (seesaw.core/frame :title "Scene 1" :width 500 :height 300 :on-close :dispose :visible? true :content (content-panel))))

