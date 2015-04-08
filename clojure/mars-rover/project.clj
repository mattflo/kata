(defproject mars-rover "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :profiles {:dev {:dependencies [[pjstadig/humane-test-output "0.6.0"]
                                  [ring-mock "0.1.5"]
                                  [clj-http-fake "0.7.8"]]

                   :plugins [[com.jakemccrary/lein-test-refresh "0.7.0"]]

                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]

                   :jvm-opts ["-Dconfig.edn=local-config.edn"]}}
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins [[com.jakemccrary/lein-test-refresh "0.7.0"]]
  :dependencies [[org.clojure/clojure "1.6.0"]])
