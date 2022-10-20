package squad.panda.boardgameinventory

import org.springframework.stereotype.Service
import squad.panda.boardgameinventory.models.BoardGameModel

@Service
class BoardGameService(val db: BoardGameRepository) {
    fun save(boardGame: BoardGameModel) {
        db.save(boardGame)
    }
}