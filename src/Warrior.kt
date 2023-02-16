interface Warrior {
    var isKilled: Boolean
    val dodgeChance: Int

    fun attack(warrior: Warrior)
    fun takeDamage(damage: Int)
}