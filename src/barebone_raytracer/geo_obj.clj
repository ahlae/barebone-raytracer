(ns barebone-raytracer.geo-obj)

(defrecord Point [x y z])

(defrecord Vector [dx dy dz])

(defrecord Ray [origin direction])

(defrecord ViewPlane [hres vres s gamma inv_gamma])
