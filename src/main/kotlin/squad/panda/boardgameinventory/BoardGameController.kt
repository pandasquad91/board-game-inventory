package squad.panda.boardgameinventory

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import squad.panda.boardgameinventory.models.BoardGameModel

@RestController
class BoardGameController(val service: BoardGameService) {
    @PostMapping
    fun post(@RequestBody boardGame: BoardGameModel) = service.save(boardGame)
}