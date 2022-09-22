package squad.panda.boardgameinventory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BoardGameInventoryApplication

fun main(args: Array<String>) {
	runApplication<BoardGameInventoryApplication>(*args)
}
