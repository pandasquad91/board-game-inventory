package squad.panda.boardgameinventory

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import squad.panda.boardgameinventory.models.BoardGameModel

@RepositoryRestResource(collectionResourceRel = "games", path = "games")
interface BoardGameRepository : CrudRepository<BoardGameModel, Long> {
}
