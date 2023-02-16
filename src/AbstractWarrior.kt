import kotlin.random.Random

abstract class AbstractWarrior(
    maxHp: Int,
    override val dodgeChance: Int,
    private val accuracy: Int,
    private var weapon: AbstractWeapon,
) : Warrior {
    open var currentHealth = maxHp
        protected set


    override var isKilled: Boolean = currentHealth <= 0


    override fun attack(warrior: Warrior) {
        val shots = weapon.getAmmo()
        if (!warrior.dodgeChance.chanceCalculator() && accuracy.chanceCalculator()) {
            var damage = 0
            for (shot in shots.elements) {
                damage += shot.currentDamage()
            }
            warrior.takeDamage(damage)
        }

    }

    fun Int.chanceCalculator(): Boolean = this <= Random.nextInt(101)
}
