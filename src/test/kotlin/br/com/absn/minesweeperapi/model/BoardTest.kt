package br.com.absn.minesweeperapi.model

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BoardTest {

    @Test
    fun create() {
        val boardActual = Board().matrixCells

        assertEquals(10, boardActual!!.size)
        assertEquals(3, boardActual[0].filter { it.content == Content.MINE }.size)
    }
}