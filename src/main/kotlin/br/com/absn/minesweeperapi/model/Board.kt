package br.com.absn.minesweeperapi.model

import kotlin.random.Random

data class Board(var matrixCells: List<List<Cell>>? = null) {

    init { matrixCells = create() }

    private fun create(): List<List<Cell>> {
        val cells = mutableListOf<List<Cell>>()

        for (i in 0..9) { cells.add(generateLineOfCells()) }

        return cells
    }

    private fun generateLineOfCells(): List<Cell> {

        val cells: MutableList<Cell> = mutableListOf()

        while (cells.size < 10) {
            if (
                (Random.nextInt(0, 10) == 5 && cells.filter { it.content == Content.MINE }.size < 3) ||
                (cells.size >= 7 && cells.filter { it.content == Content.MINE }.size < 3)
            ) {
                cells.add(Cell(state = State.COVERED, content = Content.MINE))
            }else{
                cells.add(Cell(state = State.COVERED, content = Content.NUMBER_MINE_ADJACENT))
            }
        }
        return cells
    }
}