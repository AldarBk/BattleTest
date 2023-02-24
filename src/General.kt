class General(
    var maxHp: Int = 100,
    override var dodgeChance: Int = 60,
    accuracy: Int = 85,
    var weapon: Int
) : AbstractWarrior(maxHp, dodgeChance, accuracy, Weapon.createMachineGun()) {
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