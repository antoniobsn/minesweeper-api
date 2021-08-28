package br.com.absn.minesweeperapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MinesweeperApiApplication

fun main(args: Array<String>) {
	runApplication<MinesweeperApiApplication>(*args)
}
