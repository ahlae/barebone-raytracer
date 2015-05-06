(defproject barebone-raytracer "0.1.0-SNAPSHOT"
  :description "A simple raytracer in clojure"
  :url "https://github.com/ahlae/barebone-raytracer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [seesaw "1.4.5"]]
  :main ^:skip-aot barebone-raytracer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
