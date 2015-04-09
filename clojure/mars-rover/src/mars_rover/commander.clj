(ns mars-rover.commander)

(def turn-deltas {\l {:n :w
                      :w :s
                      :s :e
                      :e :n}
                  \r {:n :e
                      :e :s
                      :s :w
                      :w :n}})

(def movement-deltas {\f {:n [0 1]
                          :s [0 -1]
                          :e [-1 0]
                          :w [1 0]}
                      \b {:n [0 -1]
                          :s [0 1]
                          :e [1 0]
                          :w [-1 0]}})

(defn move
  [command rover]
  (let [[current-x current-y current-direction] rover
        [delta-x delta-y] (get-in movement-deltas [command current-direction])
        new-x (+ current-x delta-x)
        new-y (+ current-y delta-y)
        new-rover [new-x new-y current-direction]]
    new-rover))

(defn turn [command rover]
  (let [[x y current-direction] rover
        new-direction (get-in turn-deltas [command current-direction])]
    [x y new-direction]))

(defn process-command [command rover]
  (if (contains? movement-deltas command)
    (move command rover)
    (turn command rover)))

(defn dispatch-rover [rover, commands]
  (if (seq commands)
    (recur (process-command (first commands) rover) (rest commands))
    rover))

