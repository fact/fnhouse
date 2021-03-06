(defproject prismatic/fnhouse "0.1.2-SNAPSHOT"
  :description "Transform lightly-annotated functions into a full-fledged web service"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :url "https://github.com/Prismatic/fnhouse"
  :dependencies [[prismatic/plumbing "0.3.3"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]]
                   :warn-on-reflection true}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.6"]}
  :lein-release {:deploy-via :shell
                 :shell ["lein" "deploy" "clojars"]})
