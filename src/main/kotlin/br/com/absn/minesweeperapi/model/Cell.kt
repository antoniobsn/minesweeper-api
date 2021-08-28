package br.com.absn.minesweeperapi.model

data class Cell(
    val content: Content,
    val state: State
)

enum class State {
    UNCOVERED,
    COVERED,
    FLAGGED
}

enum class Content {
    MINE,
    NUMBER_MINE_ADJACENT
}

