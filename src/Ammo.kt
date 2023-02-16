import kotlin.random.Random

enum class Ammo(
    var mainDamage: Int,
    private var criticalChance: Int,
    private var criticalDamage: Int,
) {
    SIMPLE(5, 20, 2),
    EXPLOSIVE(10, 40, 4),
    BUCKSHOT(15, 30, 3);

    open fun currentDamage(): Int {
        val currentDamage: Int = if (criticalChance.chanceCalculator()) {
            mainDamage * criticalDamage
        } else {
            mainDamage
        }
        return currentDamage
    }
}

fun Int.chanceCalculator(): Boolean = this <= Random.nextInt(101)
