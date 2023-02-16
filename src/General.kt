class General(
    var maxHp: Int = 100,
    override var dodgeChance: Int = 60,
    var accuracy:Int = 85,
    var weapon: Weapon,
    override var currentHealth: Int
) : AbstractWarrior(maxHp, dodgeChance, accuracy, Weapon.createMachineGun()) {
    override fun takeDamage(damage: Int) {
        maxHp -= damage
    }
}