(ns mars-rover.commander)

(def movement_deltas {\f {:n [0 1]
                          :s [0 -1]
                          :e [-1 0]
                          :w [1 0]}
                      \b {:n [0 -1]
                          :s [0 1]
                          :e [1 0]
                          :w [-1 0]}})

(defn move
  [command rover]
  (let [movement-deltas (get movement_deltas command)
        [current-x current-y current-direction] rover
        [delta-x delta-y] (current-direction movement-deltas)
        new-x (+ current-x delta-x)
        new-y (+ current-y delta-y)
        new-rover [new-x new-y current-direction]]
    new-rover))

(defn dispatch-rover [rover, commands]
  (if (seq commands)
    (recur (move (first commands) rover) (rest commands))
    rover))

