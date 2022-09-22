package squad.panda.boardgameinventory.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob

@Entity
data class BoardGameModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = -1,
    var title: String = "",
    var description: String = "",
    var category: String = "",
    var minPlayers: Int = 0,
    var maxPlayers: Int = 0,
    var quantity: Int = 0,
    @Lob
    var image: ByteArray = byteArrayOf(0b0,0x0)
)