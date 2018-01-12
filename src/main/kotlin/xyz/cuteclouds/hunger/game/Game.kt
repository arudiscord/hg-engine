package xyz.cuteclouds.hunger.game

import java.util.*
import kotlin.math.sqrt

data class Game(
    val tributes: List<Tribute>,
    val actions: Actions,
    val threshold: Double,
    val random: Random
) {
    val deathList = LinkedList<Tribute>()
    val thresholdSqrt = Math.floor(sqrt(threshold) * 10.0) / 10.0
}
