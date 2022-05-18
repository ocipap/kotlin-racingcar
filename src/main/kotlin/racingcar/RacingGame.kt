package racingcar

class RacingGame(private val carCount: Int, private val tryCount: Int) {
    val driverList = List(this.carCount) { Driver("papic", Car()) }

    fun start() {
        repeat(tryCount) {
            driverList.forEach {
                val isMovable = MOVE_RANGE.random() >= MOVE_CONDITION
                it.drive(isMovable)
            }
        }
    }

    companion object {
        private val MOVE_RANGE = (0..9)
        private const val MOVE_CONDITION = 4
    }
}
