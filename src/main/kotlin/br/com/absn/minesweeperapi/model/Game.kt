package br.com.absn.minesweeperapi.model

class Game {
    var status: Status = Status.IN_PROGRESS
    val board: Board = Board()
}

enum class Status {
    IN_PROGRESS,
    FINISHED
}
