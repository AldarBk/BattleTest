class Captain(
    var maxHp: Int = 60,
    override var dodgeChance: Int = 20,
    var accuracy: Int = 45,
    var weapon: Int
) : AbstractWarrior(maxHp, dodgeChance, accuracy, Weapon.createShotgun()) {
    override var currentHealth: Int
        get() = super.currentHealth
        set(value) {}
    override var isKilled: Boolean
        get() = super.isKilled
        set(value) {}

    override fun takeDamage(damage: Int) {
        maxHp -= damage
    }
}