package squad.panda.boardgameinventory

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import squad.panda.boardgameinventory.models.BoardGameModel

@SpringBootApplication
class BoardGameInventoryApplication {

	@Bean
	fun run(repository: BoardGameRepository) = ApplicationRunner {
		repository.save(BoardGameModel(
			title = "Test",
			description = "Lorem ipsum",
			category = "Social / Funny",
			minPlayers = 2,
			maxPlayers = 4,
			quantity = 1
		))
	}

}

fun main(args: Array<String>) {
	runApplication<BoardGameInventoryApplication>(*args)
}
