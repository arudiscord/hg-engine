package pw.aru.hungergames.phases

import pw.aru.hungergames.game.Game
import pw.aru.hungergames.game.Phase
import pw.aru.hungergames.game.Tribute

class Winner(
    override val game: Game,
    val winner: Tribute,
    val number: Int,
    val ranking: List<Tribute>
) : Phase() {
    override fun hasNext() = false
    override fun next() = throw NoSuchElementException()
}